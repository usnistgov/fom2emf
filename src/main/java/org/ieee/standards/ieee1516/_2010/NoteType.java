/**
 */
package org.ieee.standards.ieee1516._2010;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.NoteType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.NoteType#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.NoteType#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.NoteType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.NoteType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.NoteType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.ieee.standards.ieee1516._2010._2010Package#getNoteType()
 * @model extendedMetaData="name='note_._type' kind='elementOnly'"
 * @generated
 */
public interface NoteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getNoteType_Label()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.NoteType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' containment reference.
	 * @see #setSemantics(org.ieee.standards.ieee1516._2010.String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getNoteType_Semantics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='semantics' namespace='##targetNamespace'"
	 * @generated
	 */
	org.ieee.standards.ieee1516._2010.String getSemantics();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.NoteType#getSemantics <em>Semantics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' containment reference.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(org.ieee.standards.ieee1516._2010.String value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getNoteType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Idtag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idtag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idtag</em>' attribute.
	 * @see #setIdtag(String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getNoteType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.NoteType#getIdtag <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idtag</em>' attribute.
	 * @see #getIdtag()
	 * @generated
	 */
	void setIdtag(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(List)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getNoteType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.NoteType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(List<String> value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getNoteType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // NoteType
