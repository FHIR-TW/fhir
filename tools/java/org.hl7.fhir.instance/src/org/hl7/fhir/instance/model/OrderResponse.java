package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Fri, Nov 14, 2014 22:13+1100 for FHIR v0.3.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
/**
 * A response to an order.
 */
public class OrderResponse extends DomainResource {

    public enum OrderOutcomeCode {
        PENDING, // The order is known, but no processing has occurred at this time.
        REVIEW, // The order is undergoing initial processing to determine whether it will be accepted (usually this involves human review).
        REJECTED, // The order was rejected because of a workflow/business logic reason.
        ERROR, // The order was unable to be processed because of a technical error (i.e. unexpected error).
        ACCEPTED, // The order has been accepted, and work is in progress.
        CANCELLED, // Processing the order was halted at the initiators request.
        REPLACED, // The order has been cancelled and replaced by another.
        ABORTED, // Processing the order was stopped because of some workflow/business logic reason.
        COMPLETE, // The order has been completed.
        NULL; // added to help the parsers
        public static OrderOutcomeCode fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("pending".equals(codeString))
          return PENDING;
        if ("review".equals(codeString))
          return REVIEW;
        if ("rejected".equals(codeString))
          return REJECTED;
        if ("error".equals(codeString))
          return ERROR;
        if ("accepted".equals(codeString))
          return ACCEPTED;
        if ("cancelled".equals(codeString))
          return CANCELLED;
        if ("replaced".equals(codeString))
          return REPLACED;
        if ("aborted".equals(codeString))
          return ABORTED;
        if ("complete".equals(codeString))
          return COMPLETE;
        throw new Exception("Unknown OrderOutcomeCode code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case PENDING: return "pending";
            case REVIEW: return "review";
            case REJECTED: return "rejected";
            case ERROR: return "error";
            case ACCEPTED: return "accepted";
            case CANCELLED: return "cancelled";
            case REPLACED: return "replaced";
            case ABORTED: return "aborted";
            case COMPLETE: return "complete";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case PENDING: return "The order is known, but no processing has occurred at this time.";
            case REVIEW: return "The order is undergoing initial processing to determine whether it will be accepted (usually this involves human review).";
            case REJECTED: return "The order was rejected because of a workflow/business logic reason.";
            case ERROR: return "The order was unable to be processed because of a technical error (i.e. unexpected error).";
            case ACCEPTED: return "The order has been accepted, and work is in progress.";
            case CANCELLED: return "Processing the order was halted at the initiators request.";
            case REPLACED: return "The order has been cancelled and replaced by another.";
            case ABORTED: return "Processing the order was stopped because of some workflow/business logic reason.";
            case COMPLETE: return "The order has been completed.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case PENDING: return "pending";
            case REVIEW: return "review";
            case REJECTED: return "rejected";
            case ERROR: return "error";
            case ACCEPTED: return "accepted";
            case CANCELLED: return "cancelled";
            case REPLACED: return "replaced";
            case ABORTED: return "aborted";
            case COMPLETE: return "complete";
            default: return "?";
          }
        }
    }

  public static class OrderOutcomeCodeEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("pending".equals(codeString))
          return OrderOutcomeCode.PENDING;
        if ("review".equals(codeString))
          return OrderOutcomeCode.REVIEW;
        if ("rejected".equals(codeString))
          return OrderOutcomeCode.REJECTED;
        if ("error".equals(codeString))
          return OrderOutcomeCode.ERROR;
        if ("accepted".equals(codeString))
          return OrderOutcomeCode.ACCEPTED;
        if ("cancelled".equals(codeString))
          return OrderOutcomeCode.CANCELLED;
        if ("replaced".equals(codeString))
          return OrderOutcomeCode.REPLACED;
        if ("aborted".equals(codeString))
          return OrderOutcomeCode.ABORTED;
        if ("complete".equals(codeString))
          return OrderOutcomeCode.COMPLETE;
        throw new Exception("Unknown OrderOutcomeCode code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == OrderOutcomeCode.PENDING)
        return "pending";
      if (code == OrderOutcomeCode.REVIEW)
        return "review";
      if (code == OrderOutcomeCode.REJECTED)
        return "rejected";
      if (code == OrderOutcomeCode.ERROR)
        return "error";
      if (code == OrderOutcomeCode.ACCEPTED)
        return "accepted";
      if (code == OrderOutcomeCode.CANCELLED)
        return "cancelled";
      if (code == OrderOutcomeCode.REPLACED)
        return "replaced";
      if (code == OrderOutcomeCode.ABORTED)
        return "aborted";
      if (code == OrderOutcomeCode.COMPLETE)
        return "complete";
      return "?";
      }
    }

    /**
     * Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems.
     */
    protected List<Identifier> identifier = new ArrayList<Identifier>();

    /**
     * A reference to the order that this is in response to.
     */
    protected Reference request;

    /**
     * The actual object that is the target of the reference (A reference to the order that this is in response to.)
     */
    protected Order requestTarget;

    /**
     * The date and time at which this order response was made (created/posted).
     */
    protected DateTimeType date;

    /**
     * The person, organization, or device credited with making the response.
     */
    protected Reference who;

    /**
     * The actual object that is the target of the reference (The person, organization, or device credited with making the response.)
     */
    protected Resource whoTarget;

    /**
     * A reference to an authority policy that is the reason for the response. Usually this is used when the order is rejected, to provide a reason for rejection.
     */
    protected Type authority;

    /**
     * What this response says about the status of the original order.
     */
    protected Enumeration<OrderOutcomeCode> code;

    /**
     * Additional description about the response - e.g. a text description provided by a human user when making decisions about the order.
     */
    protected StringType description;

    /**
     * Links to resources that provide details of the outcome of performing the order. E.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order.
     */
    protected List<Reference> fulfillment = new ArrayList<Reference>();
    /**
     * The actual objects that are the target of the reference (Links to resources that provide details of the outcome of performing the order. E.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order.)
     */
    protected List<Resource> fulfillmentTarget = new ArrayList<Resource>();


    private static final long serialVersionUID = 499827481L;

    public OrderResponse() {
      super();
    }

    public OrderResponse(Reference request, Enumeration<OrderOutcomeCode> code) {
      super();
      this.request = request;
      this.code = code;
    }

    /**
     * @return {@link #identifier} (Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems.)
     */
    public List<Identifier> getIdentifier() { 
      return this.identifier;
    }

    /**
     * @return {@link #identifier} (Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems.)
     */
    // syntactic sugar
    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      this.identifier.add(t);
      return t;
    }

    /**
     * @return {@link #request} (A reference to the order that this is in response to.)
     */
    public Reference getRequest() { 
      return this.request;
    }

    /**
     * @param value {@link #request} (A reference to the order that this is in response to.)
     */
    public OrderResponse setRequest(Reference value) { 
      this.request = value;
      return this;
    }

    /**
     * @return {@link #request} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to the order that this is in response to.)
     */
    public Order getRequestTarget() { 
      return this.requestTarget;
    }

    /**
     * @param value {@link #request} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to the order that this is in response to.)
     */
    public OrderResponse setRequestTarget(Order value) { 
      this.requestTarget = value;
      return this;
    }

    /**
     * @return {@link #date} (The date and time at which this order response was made (created/posted).). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      return this.date;
    }

    /**
     * @param value {@link #date} (The date and time at which this order response was made (created/posted).). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public OrderResponse setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date and time at which this order response was made (created/posted).
     */
    public DateAndTime getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date and time at which this order response was made (created/posted).
     */
    public OrderResponse setDate(DateAndTime value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #who} (The person, organization, or device credited with making the response.)
     */
    public Reference getWho() { 
      return this.who;
    }

    /**
     * @param value {@link #who} (The person, organization, or device credited with making the response.)
     */
    public OrderResponse setWho(Reference value) { 
      this.who = value;
      return this;
    }

    /**
     * @return {@link #who} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The person, organization, or device credited with making the response.)
     */
    public Resource getWhoTarget() { 
      return this.whoTarget;
    }

    /**
     * @param value {@link #who} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The person, organization, or device credited with making the response.)
     */
    public OrderResponse setWhoTarget(Resource value) { 
      this.whoTarget = value;
      return this;
    }

    /**
     * @return {@link #authority} (A reference to an authority policy that is the reason for the response. Usually this is used when the order is rejected, to provide a reason for rejection.)
     */
    public Type getAuthority() { 
      return this.authority;
    }

    /**
     * @param value {@link #authority} (A reference to an authority policy that is the reason for the response. Usually this is used when the order is rejected, to provide a reason for rejection.)
     */
    public OrderResponse setAuthority(Type value) { 
      this.authority = value;
      return this;
    }

    /**
     * @return {@link #code} (What this response says about the status of the original order.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public Enumeration<OrderOutcomeCode> getCodeElement() { 
      return this.code;
    }

    /**
     * @param value {@link #code} (What this response says about the status of the original order.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
     */
    public OrderResponse setCodeElement(Enumeration<OrderOutcomeCode> value) { 
      this.code = value;
      return this;
    }

    /**
     * @return What this response says about the status of the original order.
     */
    public OrderOutcomeCode getCode() { 
      return this.code == null ? null : this.code.getValue();
    }

    /**
     * @param value What this response says about the status of the original order.
     */
    public OrderResponse setCode(OrderOutcomeCode value) { 
        if (this.code == null)
          this.code = new Enumeration<OrderOutcomeCode>();
        this.code.setValue(value);
      return this;
    }

    /**
     * @return {@link #description} (Additional description about the response - e.g. a text description provided by a human user when making decisions about the order.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() { 
      return this.description;
    }

    /**
     * @param value {@link #description} (Additional description about the response - e.g. a text description provided by a human user when making decisions about the order.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public OrderResponse setDescriptionElement(StringType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return Additional description about the response - e.g. a text description provided by a human user when making decisions about the order.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Additional description about the response - e.g. a text description provided by a human user when making decisions about the order.
     */
    public OrderResponse setDescription(String value) { 
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #fulfillment} (Links to resources that provide details of the outcome of performing the order. E.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order.)
     */
    public List<Reference> getFulfillment() { 
      return this.fulfillment;
    }

    /**
     * @return {@link #fulfillment} (Links to resources that provide details of the outcome of performing the order. E.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order.)
     */
    // syntactic sugar
    public Reference addFulfillment() { //3
      Reference t = new Reference();
      this.fulfillment.add(t);
      return t;
    }

    /**
     * @return {@link #fulfillment} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Links to resources that provide details of the outcome of performing the order. E.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order.)
     */
    public List<Resource> getFulfillmentTarget() { 
      return this.fulfillmentTarget;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("request", "Reference(Order)", "A reference to the order that this is in response to.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("date", "dateTime", "The date and time at which this order response was made (created/posted).", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("who", "Reference(Practitioner|Organization|Device)", "The person, organization, or device credited with making the response.", 0, java.lang.Integer.MAX_VALUE, who));
        childrenList.add(new Property("authority[x]", "CodeableConcept|Reference(Any)", "A reference to an authority policy that is the reason for the response. Usually this is used when the order is rejected, to provide a reason for rejection.", 0, java.lang.Integer.MAX_VALUE, authority));
        childrenList.add(new Property("code", "code", "What this response says about the status of the original order.", 0, java.lang.Integer.MAX_VALUE, code));
        childrenList.add(new Property("description", "string", "Additional description about the response - e.g. a text description provided by a human user when making decisions about the order.", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("fulfillment", "Reference(Any)", "Links to resources that provide details of the outcome of performing the order. E.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order.", 0, java.lang.Integer.MAX_VALUE, fulfillment));
      }

      public OrderResponse copy() {
        OrderResponse dst = new OrderResponse();
        copyValues(dst);
        dst.identifier = new ArrayList<Identifier>();
        for (Identifier i : identifier)
          dst.identifier.add(i.copy());
        dst.request = request == null ? null : request.copy();
        dst.date = date == null ? null : date.copy();
        dst.who = who == null ? null : who.copy();
        dst.authority = authority == null ? null : authority.copy();
        dst.code = code == null ? null : code.copy();
        dst.description = description == null ? null : description.copy();
        dst.fulfillment = new ArrayList<Reference>();
        for (Reference i : fulfillment)
          dst.fulfillment.add(i.copy());
        return dst;
      }

      protected OrderResponse typedCopy() {
        return copy();
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.OrderResponse;
   }


}

