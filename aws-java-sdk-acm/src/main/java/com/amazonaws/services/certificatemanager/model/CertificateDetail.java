/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;

/**
 * <p>
 * Contains detailed metadata about an ACM Certificate. This structure is
 * returned in the response to a <a>DescribeCertificate</a> request.
 * </p>
 */
public class CertificateDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. For more information
     * about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The fully qualified domain name (FQDN) for the certificate, such as
     * www.example.com or example.com.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * One or more domain names (subject alternative names) included in the
     * certificate request. After the certificate is issued, this list includes
     * the domain names bound to the public key contained in the certificate.
     * The subject alternative names include the canonical domain name (CN) of
     * the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     */
    private java.util.List<String> subjectAlternativeNames;
    /**
     * <p>
     * Contains information about the email address or addresses used for domain
     * validation.
     * </p>
     */
    private java.util.List<DomainValidation> domainValidationOptions;
    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     */
    private String serial;
    /**
     * <p>
     * The X.500 distinguished name of the entity associated with the public key
     * contained in the certificate.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The X.500 distinguished name of the CA that issued and signed the
     * certificate.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The time at which the certificate was requested.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time at which the certificate was issued.
     * </p>
     */
    private java.util.Date issuedAt;
    /**
     * <p>
     * The status of the certificate.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the certificate was revoked. This value exists only
     * when the certificate status is <code>REVOKED</code>.
     * </p>
     */
    private java.util.Date revokedAt;
    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the
     * certificate status is <code>REVOKED</code>.
     * </p>
     */
    private String revocationReason;
    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     */
    private java.util.Date notBefore;
    /**
     * <p>
     * The time after which the certificate is not valid.
     * </p>
     */
    private java.util.Date notAfter;
    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key).
     * Currently the only supported value is <code>RSA_2048</code>.
     * </p>
     */
    private String keyAlgorithm;
    /**
     * <p>
     * The algorithm used to generate a signature. Currently the only supported
     * value is <code>SHA256WITHRSA</code>.
     * </p>
     */
    private String signatureAlgorithm;
    /**
     * <p>
     * A list of ARNs for the resources that are using the certificate. An ACM
     * Certificate can be used by multiple AWS resources.
     * </p>
     */
    private java.util.List<String> inUseBy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. For more information
     * about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate. For more
     *        information about ARNs, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. For more information
     * about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate. For more
     *         information about ARNs, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. For more information
     * about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate. For more
     *        information about ARNs, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) for the certificate, such as
     * www.example.com or example.com.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name (FQDN) for the certificate, such
     *        as www.example.com or example.com.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) for the certificate, such as
     * www.example.com or example.com.
     * </p>
     * 
     * @return The fully qualified domain name (FQDN) for the certificate, such
     *         as www.example.com or example.com.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) for the certificate, such as
     * www.example.com or example.com.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name (FQDN) for the certificate, such
     *        as www.example.com or example.com.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the
     * certificate request. After the certificate is issued, this list includes
     * the domain names bound to the public key contained in the certificate.
     * The subject alternative names include the canonical domain name (CN) of
     * the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * 
     * @return One or more domain names (subject alternative names) included in
     *         the certificate request. After the certificate is issued, this
     *         list includes the domain names bound to the public key contained
     *         in the certificate. The subject alternative names include the
     *         canonical domain name (CN) of the certificate and additional
     *         domain names that can be used to connect to the website.
     */

    public java.util.List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the
     * certificate request. After the certificate is issued, this list includes
     * the domain names bound to the public key contained in the certificate.
     * The subject alternative names include the canonical domain name (CN) of
     * the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domain names (subject alternative names) included in
     *        the certificate request. After the certificate is issued, this
     *        list includes the domain names bound to the public key contained
     *        in the certificate. The subject alternative names include the
     *        canonical domain name (CN) of the certificate and additional
     *        domain names that can be used to connect to the website.
     */

    public void setSubjectAlternativeNames(
            java.util.Collection<String> subjectAlternativeNames) {
        if (subjectAlternativeNames == null) {
            this.subjectAlternativeNames = null;
            return;
        }

        this.subjectAlternativeNames = new java.util.ArrayList<String>(
                subjectAlternativeNames);
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the
     * certificate request. After the certificate is issued, this list includes
     * the domain names bound to the public key contained in the certificate.
     * The subject alternative names include the canonical domain name (CN) of
     * the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubjectAlternativeNames(java.util.Collection)} or
     * {@link #withSubjectAlternativeNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domain names (subject alternative names) included in
     *        the certificate request. After the certificate is issued, this
     *        list includes the domain names bound to the public key contained
     *        in the certificate. The subject alternative names include the
     *        canonical domain name (CN) of the certificate and additional
     *        domain names that can be used to connect to the website.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withSubjectAlternativeNames(
            String... subjectAlternativeNames) {
        if (this.subjectAlternativeNames == null) {
            setSubjectAlternativeNames(new java.util.ArrayList<String>(
                    subjectAlternativeNames.length));
        }
        for (String ele : subjectAlternativeNames) {
            this.subjectAlternativeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the
     * certificate request. After the certificate is issued, this list includes
     * the domain names bound to the public key contained in the certificate.
     * The subject alternative names include the canonical domain name (CN) of
     * the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domain names (subject alternative names) included in
     *        the certificate request. After the certificate is issued, this
     *        list includes the domain names bound to the public key contained
     *        in the certificate. The subject alternative names include the
     *        canonical domain name (CN) of the certificate and additional
     *        domain names that can be used to connect to the website.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withSubjectAlternativeNames(
            java.util.Collection<String> subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
        return this;
    }

    /**
     * <p>
     * Contains information about the email address or addresses used for domain
     * validation.
     * </p>
     * 
     * @return Contains information about the email address or addresses used
     *         for domain validation.
     */

    public java.util.List<DomainValidation> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * <p>
     * Contains information about the email address or addresses used for domain
     * validation.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the email address or addresses used for
     *        domain validation.
     */

    public void setDomainValidationOptions(
            java.util.Collection<DomainValidation> domainValidationOptions) {
        if (domainValidationOptions == null) {
            this.domainValidationOptions = null;
            return;
        }

        this.domainValidationOptions = new java.util.ArrayList<DomainValidation>(
                domainValidationOptions);
    }

    /**
     * <p>
     * Contains information about the email address or addresses used for domain
     * validation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDomainValidationOptions(java.util.Collection)} or
     * {@link #withDomainValidationOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the email address or addresses used for
     *        domain validation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withDomainValidationOptions(
            DomainValidation... domainValidationOptions) {
        if (this.domainValidationOptions == null) {
            setDomainValidationOptions(new java.util.ArrayList<DomainValidation>(
                    domainValidationOptions.length));
        }
        for (DomainValidation ele : domainValidationOptions) {
            this.domainValidationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the email address or addresses used for domain
     * validation.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the email address or addresses used for
     *        domain validation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withDomainValidationOptions(
            java.util.Collection<DomainValidation> domainValidationOptions) {
        setDomainValidationOptions(domainValidationOptions);
        return this;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serial
     *        The serial number of the certificate.
     */

    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @return The serial number of the certificate.
     */

    public String getSerial() {
        return this.serial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serial
     *        The serial number of the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withSerial(String serial) {
        setSerial(serial);
        return this;
    }

    /**
     * <p>
     * The X.500 distinguished name of the entity associated with the public key
     * contained in the certificate.
     * </p>
     * 
     * @param subject
     *        The X.500 distinguished name of the entity associated with the
     *        public key contained in the certificate.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The X.500 distinguished name of the entity associated with the public key
     * contained in the certificate.
     * </p>
     * 
     * @return The X.500 distinguished name of the entity associated with the
     *         public key contained in the certificate.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The X.500 distinguished name of the entity associated with the public key
     * contained in the certificate.
     * </p>
     * 
     * @param subject
     *        The X.500 distinguished name of the entity associated with the
     *        public key contained in the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The X.500 distinguished name of the CA that issued and signed the
     * certificate.
     * </p>
     * 
     * @param issuer
     *        The X.500 distinguished name of the CA that issued and signed the
     *        certificate.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The X.500 distinguished name of the CA that issued and signed the
     * certificate.
     * </p>
     * 
     * @return The X.500 distinguished name of the CA that issued and signed the
     *         certificate.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The X.500 distinguished name of the CA that issued and signed the
     * certificate.
     * </p>
     * 
     * @param issuer
     *        The X.500 distinguished name of the CA that issued and signed the
     *        certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The time at which the certificate was requested.
     * </p>
     * 
     * @param createdAt
     *        The time at which the certificate was requested.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the certificate was requested.
     * </p>
     * 
     * @return The time at which the certificate was requested.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the certificate was requested.
     * </p>
     * 
     * @param createdAt
     *        The time at which the certificate was requested.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time at which the certificate was issued.
     * </p>
     * 
     * @param issuedAt
     *        The time at which the certificate was issued.
     */

    public void setIssuedAt(java.util.Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    /**
     * <p>
     * The time at which the certificate was issued.
     * </p>
     * 
     * @return The time at which the certificate was issued.
     */

    public java.util.Date getIssuedAt() {
        return this.issuedAt;
    }

    /**
     * <p>
     * The time at which the certificate was issued.
     * </p>
     * 
     * @param issuedAt
     *        The time at which the certificate was issued.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withIssuedAt(java.util.Date issuedAt) {
        setIssuedAt(issuedAt);
        return this;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @see CertificateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @return The status of the certificate.
     * @see CertificateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */

    public CertificateDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @see CertificateStatus
     */

    public void setStatus(CertificateStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */

    public CertificateDetail withStatus(CertificateStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The time at which the certificate was revoked. This value exists only
     * when the certificate status is <code>REVOKED</code>.
     * </p>
     * 
     * @param revokedAt
     *        The time at which the certificate was revoked. This value exists
     *        only when the certificate status is <code>REVOKED</code>.
     */

    public void setRevokedAt(java.util.Date revokedAt) {
        this.revokedAt = revokedAt;
    }

    /**
     * <p>
     * The time at which the certificate was revoked. This value exists only
     * when the certificate status is <code>REVOKED</code>.
     * </p>
     * 
     * @return The time at which the certificate was revoked. This value exists
     *         only when the certificate status is <code>REVOKED</code>.
     */

    public java.util.Date getRevokedAt() {
        return this.revokedAt;
    }

    /**
     * <p>
     * The time at which the certificate was revoked. This value exists only
     * when the certificate status is <code>REVOKED</code>.
     * </p>
     * 
     * @param revokedAt
     *        The time at which the certificate was revoked. This value exists
     *        only when the certificate status is <code>REVOKED</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withRevokedAt(java.util.Date revokedAt) {
        setRevokedAt(revokedAt);
        return this;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the
     * certificate status is <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value exists only
     *        when the certificate status is <code>REVOKED</code>.
     * @see RevocationReason
     */

    public void setRevocationReason(String revocationReason) {
        this.revocationReason = revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the
     * certificate status is <code>REVOKED</code>.
     * </p>
     * 
     * @return The reason the certificate was revoked. This value exists only
     *         when the certificate status is <code>REVOKED</code>.
     * @see RevocationReason
     */

    public String getRevocationReason() {
        return this.revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the
     * certificate status is <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value exists only
     *        when the certificate status is <code>REVOKED</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RevocationReason
     */

    public CertificateDetail withRevocationReason(String revocationReason) {
        setRevocationReason(revocationReason);
        return this;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the
     * certificate status is <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value exists only
     *        when the certificate status is <code>REVOKED</code>.
     * @see RevocationReason
     */

    public void setRevocationReason(RevocationReason revocationReason) {
        this.revocationReason = revocationReason.toString();
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the
     * certificate status is <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value exists only
     *        when the certificate status is <code>REVOKED</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RevocationReason
     */

    public CertificateDetail withRevocationReason(
            RevocationReason revocationReason) {
        setRevocationReason(revocationReason);
        return this;
    }

    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * 
     * @param notBefore
     *        The time before which the certificate is not valid.
     */

    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * 
     * @return The time before which the certificate is not valid.
     */

    public java.util.Date getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * 
     * @param notBefore
     *        The time before which the certificate is not valid.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withNotBefore(java.util.Date notBefore) {
        setNotBefore(notBefore);
        return this;
    }

    /**
     * <p>
     * The time after which the certificate is not valid.
     * </p>
     * 
     * @param notAfter
     *        The time after which the certificate is not valid.
     */

    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The time after which the certificate is not valid.
     * </p>
     * 
     * @return The time after which the certificate is not valid.
     */

    public java.util.Date getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * The time after which the certificate is not valid.
     * </p>
     * 
     * @param notAfter
     *        The time after which the certificate is not valid.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key).
     * Currently the only supported value is <code>RSA_2048</code>.
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm used to generate the key pair (the public and
     *        private key). Currently the only supported value is
     *        <code>RSA_2048</code>.
     * @see KeyAlgorithm
     */

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key).
     * Currently the only supported value is <code>RSA_2048</code>.
     * </p>
     * 
     * @return The algorithm used to generate the key pair (the public and
     *         private key). Currently the only supported value is
     *         <code>RSA_2048</code>.
     * @see KeyAlgorithm
     */

    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key).
     * Currently the only supported value is <code>RSA_2048</code>.
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm used to generate the key pair (the public and
     *        private key). Currently the only supported value is
     *        <code>RSA_2048</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyAlgorithm
     */

    public CertificateDetail withKeyAlgorithm(String keyAlgorithm) {
        setKeyAlgorithm(keyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key).
     * Currently the only supported value is <code>RSA_2048</code>.
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm used to generate the key pair (the public and
     *        private key). Currently the only supported value is
     *        <code>RSA_2048</code>.
     * @see KeyAlgorithm
     */

    public void setKeyAlgorithm(KeyAlgorithm keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm.toString();
    }

    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key).
     * Currently the only supported value is <code>RSA_2048</code>.
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm used to generate the key pair (the public and
     *        private key). Currently the only supported value is
     *        <code>RSA_2048</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyAlgorithm
     */

    public CertificateDetail withKeyAlgorithm(KeyAlgorithm keyAlgorithm) {
        setKeyAlgorithm(keyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate a signature. Currently the only supported
     * value is <code>SHA256WITHRSA</code>.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The algorithm used to generate a signature. Currently the only
     *        supported value is <code>SHA256WITHRSA</code>.
     */

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate a signature. Currently the only supported
     * value is <code>SHA256WITHRSA</code>.
     * </p>
     * 
     * @return The algorithm used to generate a signature. Currently the only
     *         supported value is <code>SHA256WITHRSA</code>.
     */

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate a signature. Currently the only supported
     * value is <code>SHA256WITHRSA</code>.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The algorithm used to generate a signature. Currently the only
     *        supported value is <code>SHA256WITHRSA</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withSignatureAlgorithm(String signatureAlgorithm) {
        setSignatureAlgorithm(signatureAlgorithm);
        return this;
    }

    /**
     * <p>
     * A list of ARNs for the resources that are using the certificate. An ACM
     * Certificate can be used by multiple AWS resources.
     * </p>
     * 
     * @return A list of ARNs for the resources that are using the certificate.
     *         An ACM Certificate can be used by multiple AWS resources.
     */

    public java.util.List<String> getInUseBy() {
        return inUseBy;
    }

    /**
     * <p>
     * A list of ARNs for the resources that are using the certificate. An ACM
     * Certificate can be used by multiple AWS resources.
     * </p>
     * 
     * @param inUseBy
     *        A list of ARNs for the resources that are using the certificate.
     *        An ACM Certificate can be used by multiple AWS resources.
     */

    public void setInUseBy(java.util.Collection<String> inUseBy) {
        if (inUseBy == null) {
            this.inUseBy = null;
            return;
        }

        this.inUseBy = new java.util.ArrayList<String>(inUseBy);
    }

    /**
     * <p>
     * A list of ARNs for the resources that are using the certificate. An ACM
     * Certificate can be used by multiple AWS resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInUseBy(java.util.Collection)} or
     * {@link #withInUseBy(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inUseBy
     *        A list of ARNs for the resources that are using the certificate.
     *        An ACM Certificate can be used by multiple AWS resources.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withInUseBy(String... inUseBy) {
        if (this.inUseBy == null) {
            setInUseBy(new java.util.ArrayList<String>(inUseBy.length));
        }
        for (String ele : inUseBy) {
            this.inUseBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs for the resources that are using the certificate. An ACM
     * Certificate can be used by multiple AWS resources.
     * </p>
     * 
     * @param inUseBy
     *        A list of ARNs for the resources that are using the certificate.
     *        An ACM Certificate can be used by multiple AWS resources.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDetail withInUseBy(java.util.Collection<String> inUseBy) {
        setInUseBy(inUseBy);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: "
                    + getSubjectAlternativeNames() + ",");
        if (getDomainValidationOptions() != null)
            sb.append("DomainValidationOptions: "
                    + getDomainValidationOptions() + ",");
        if (getSerial() != null)
            sb.append("Serial: " + getSerial() + ",");
        if (getSubject() != null)
            sb.append("Subject: " + getSubject() + ",");
        if (getIssuer() != null)
            sb.append("Issuer: " + getIssuer() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getIssuedAt() != null)
            sb.append("IssuedAt: " + getIssuedAt() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getRevokedAt() != null)
            sb.append("RevokedAt: " + getRevokedAt() + ",");
        if (getRevocationReason() != null)
            sb.append("RevocationReason: " + getRevocationReason() + ",");
        if (getNotBefore() != null)
            sb.append("NotBefore: " + getNotBefore() + ",");
        if (getNotAfter() != null)
            sb.append("NotAfter: " + getNotAfter() + ",");
        if (getKeyAlgorithm() != null)
            sb.append("KeyAlgorithm: " + getKeyAlgorithm() + ",");
        if (getSignatureAlgorithm() != null)
            sb.append("SignatureAlgorithm: " + getSignatureAlgorithm() + ",");
        if (getInUseBy() != null)
            sb.append("InUseBy: " + getInUseBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateDetail == false)
            return false;
        CertificateDetail other = (CertificateDetail) obj;
        if (other.getCertificateArn() == null
                ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSubjectAlternativeNames() == null
                ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null
                && other.getSubjectAlternativeNames().equals(
                        this.getSubjectAlternativeNames()) == false)
            return false;
        if (other.getDomainValidationOptions() == null
                ^ this.getDomainValidationOptions() == null)
            return false;
        if (other.getDomainValidationOptions() != null
                && other.getDomainValidationOptions().equals(
                        this.getDomainValidationOptions()) == false)
            return false;
        if (other.getSerial() == null ^ this.getSerial() == null)
            return false;
        if (other.getSerial() != null
                && other.getSerial().equals(this.getSerial()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null
                && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null
                && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getIssuedAt() == null ^ this.getIssuedAt() == null)
            return false;
        if (other.getIssuedAt() != null
                && other.getIssuedAt().equals(this.getIssuedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRevokedAt() == null ^ this.getRevokedAt() == null)
            return false;
        if (other.getRevokedAt() != null
                && other.getRevokedAt().equals(this.getRevokedAt()) == false)
            return false;
        if (other.getRevocationReason() == null
                ^ this.getRevocationReason() == null)
            return false;
        if (other.getRevocationReason() != null
                && other.getRevocationReason().equals(
                        this.getRevocationReason()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null
                && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null
                && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getKeyAlgorithm() == null ^ this.getKeyAlgorithm() == null)
            return false;
        if (other.getKeyAlgorithm() != null
                && other.getKeyAlgorithm().equals(this.getKeyAlgorithm()) == false)
            return false;
        if (other.getSignatureAlgorithm() == null
                ^ this.getSignatureAlgorithm() == null)
            return false;
        if (other.getSignatureAlgorithm() != null
                && other.getSignatureAlgorithm().equals(
                        this.getSignatureAlgorithm()) == false)
            return false;
        if (other.getInUseBy() == null ^ this.getInUseBy() == null)
            return false;
        if (other.getInUseBy() != null
                && other.getInUseBy().equals(this.getInUseBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSubjectAlternativeNames() == null) ? 0
                        : getSubjectAlternativeNames().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainValidationOptions() == null) ? 0
                        : getDomainValidationOptions().hashCode());
        hashCode = prime * hashCode
                + ((getSerial() == null) ? 0 : getSerial().hashCode());
        hashCode = prime * hashCode
                + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode
                + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getIssuedAt() == null) ? 0 : getIssuedAt().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getRevokedAt() == null) ? 0 : getRevokedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getRevocationReason() == null) ? 0 : getRevocationReason()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode
                + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime
                * hashCode
                + ((getKeyAlgorithm() == null) ? 0 : getKeyAlgorithm()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSignatureAlgorithm() == null) ? 0
                        : getSignatureAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getInUseBy() == null) ? 0 : getInUseBy().hashCode());
        return hashCode;
    }

    @Override
    public CertificateDetail clone() {
        try {
            return (CertificateDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
