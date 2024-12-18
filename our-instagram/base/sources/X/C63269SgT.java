package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.SgT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63269SgT {
    public static final C63269SgT A00;
    public static final Map A01;
    public static final java.util.Set A02;
    public static final java.util.Set A03;
    public static final java.util.Set A04;
    public static final java.util.Set A05;
    public static final java.util.Set A06;
    public static final java.util.Set A07;
    public static final java.util.Set A08;
    public static final java.util.Set A09;
    public static final java.util.Set A0A;
    public static final java.util.Set A0B;
    public static final java.util.Set A0C;
    public static final java.util.Set A0D;
    public static final java.util.Set A0E;
    public static final java.util.Set A0F;
    public static final java.util.Set A0G;
    public static final java.util.Set A0H;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SgT, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        java.util.Set A012 = A01(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "given-name", "family-name"});
        A06 = A012;
        java.util.Set A013 = A01(new String[]{"tel", "address-line1", "address-line2", "address-level1", "address-level2", "country", "email"});
        A07 = A013;
        java.util.Set A014 = A01(new String[]{"cc-name", "cc-given-name", "cc-additional-name", "cc-family-name", "cc-number", "cc-exp", "cc-exp-month", "cc-exp-year", "cc-csc"});
        A0B = A014;
        java.util.Set A015 = A01(new String[]{"cc-name", "cc-given-name", "cc-additional-name", "cc-family-name"});
        A02 = A015;
        A0C = A01(new String[]{"cc-number", "cc-exp", "cc-exp-month", "cc-exp-year", "cc-csc"});
        A0A = A01(new String[]{"ml-cc-exp", "ml-cc-exp-month", "ml-cc-exp-year", "ml-cc-csc"});
        java.util.Set A016 = A01(new String[]{AbstractC58347Ptn.A00(19, 8, 88), "email", "current-password"});
        A09 = A016;
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        A0Z.put("cc-number", "raw-cc-number");
        A0Z.put("cc-csc", "raw-cc-csc");
        A0Z.put("cc-exp", "raw-cc-exp");
        A0Z.put("cc-exp-year", "raw-cc-exp-year");
        A0Z.put("cc-exp-month", "raw-cc-exp-month");
        ImmutableMap buildOrThrow = A0Z.buildOrThrow();
        C14360o3.A07(buildOrThrow);
        A01 = buildOrThrow;
        A0E = A01(new String[]{"CONTACT_AUTOFILL", "CONTACT_AND_PAYMENT_AUTOFILL"});
        A0G = A01(new String[]{"PAYMENT_AUTOFILL", "CONTACT_AND_PAYMENT_AUTOFILL"});
        A0D = A01(new String[]{"CONTACT_AUTOFILL", "PAYMENT_AUTOFILL"});
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.addAll(A012);
        A1H.addAll(A013);
        A1H.add("postal-code");
        java.util.Set unmodifiableSet = Collections.unmodifiableSet(A1H);
        C14360o3.A07(unmodifiableSet);
        A04 = unmodifiableSet;
        A08 = obj.A00(A014, unmodifiableSet);
        A0H = obj.A00(A016, unmodifiableSet);
        A03 = obj.A00(unmodifiableSet, A015);
        A05 = obj.A00(A012, A015);
        ImmutableSet A017 = ImmutableSet.A01("PAYMENT_ONLY", "ANY_PAYMENT", "PERSISTENT");
        C14360o3.A07(A017);
        A0F = A017;
    }

    private final java.util.Set A00(java.util.Set set, java.util.Set set2) {
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.addAll(set);
        A1H.addAll(set2);
        java.util.Set unmodifiableSet = Collections.unmodifiableSet(A1H);
        C14360o3.A07(unmodifiableSet);
        java.util.Set unmodifiableSet2 = Collections.unmodifiableSet(unmodifiableSet);
        C14360o3.A07(unmodifiableSet2);
        return unmodifiableSet2;
    }

    public static java.util.Set A01(Object[] objArr) {
        java.util.Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(AbstractC16960so.A1Q(objArr)));
        C14360o3.A07(unmodifiableSet);
        return unmodifiableSet;
    }
}
