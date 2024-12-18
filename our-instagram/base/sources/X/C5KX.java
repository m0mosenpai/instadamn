package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.5KX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5KX {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.5KZ, X.3Sg] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.5KY, java.lang.Object] */
    public static final C5KZ A00(InterfaceC16660sJ interfaceC16660sJ, AbstractC73763Sg abstractC73763Sg) {
        C14360o3.A0B(abstractC73763Sg, 0);
        ?? obj = new Object();
        C73783Si c73783Si = abstractC73763Sg.A00;
        obj.A0A = c73783Si.A09;
        obj.A0B = c73783Si.A0A;
        obj.A0C = c73783Si.A0B;
        obj.A0D = c73783Si.A0C;
        obj.A0E = c73783Si.A0D;
        obj.A02 = c73783Si.A02;
        obj.A08 = c73783Si.A07;
        obj.A01 = c73783Si.A01;
        obj.A00 = c73783Si.A00;
        obj.A0F = c73783Si.A0E;
        obj.A09 = c73783Si.A08;
        obj.A07 = c73783Si.A06;
        obj.A04 = c73783Si.A03;
        obj.A05 = c73783Si.A04;
        obj.A06 = c73783Si.A05;
        obj.A0G = c73783Si.A0F;
        obj.A03 = abstractC73763Sg.A02;
        interfaceC16660sJ.invoke(obj);
        boolean z = obj.A0G;
        if (z) {
            if (C14360o3.A0K(obj.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                if (obj.A00 != C05F.A0C) {
                    throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
                }
            } else {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
        }
        boolean z2 = obj.A0E;
        String str = obj.A02;
        boolean A0K = C14360o3.A0K(str, "    ");
        if (!z2) {
            if (!A0K) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        } else if (!A0K) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException(AnonymousClass001.A0R("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ", str));
                }
            }
        }
        boolean z3 = obj.A0A;
        boolean z4 = obj.A0C;
        boolean z5 = obj.A0D;
        boolean z6 = obj.A06;
        boolean z7 = obj.A0B;
        boolean z8 = obj.A08;
        C73783Si c73783Si2 = new C73783Si(obj.A00, str, obj.A01, z3, z4, z5, z6, z2, z7, z8, z, obj.A05, obj.A0F, obj.A09, obj.A07, obj.A04);
        C73803Sk c73803Sk = obj.A03;
        C14360o3.A0B(c73803Sk, 2);
        ?? abstractC73763Sg2 = new AbstractC73763Sg(c73783Si2, c73803Sk);
        C73803Sk c73803Sk2 = abstractC73763Sg2.A02;
        if (!C14360o3.A0K(c73803Sk2, AbstractC73793Sj.A00)) {
            C73783Si c73783Si3 = abstractC73763Sg2.A00;
            boolean z9 = c73783Si3.A0F;
            String str2 = c73783Si3.A01;
            Iterator it = c73803Sk2.A00.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw new RuntimeException();
            }
            for (Map.Entry entry2 : c73803Sk2.A04.entrySet()) {
                Object key = entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    InterfaceC16510rw interfaceC16510rw = (InterfaceC16510rw) entry3.getKey();
                    C3R9 c3r9 = (C3R9) entry3.getValue();
                    C14360o3.A0C(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    C14360o3.A0C(interfaceC16510rw, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    C14360o3.A0C(c3r9, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    C14360o3.A0B(interfaceC16510rw, 1);
                    C14360o3.A0B(c3r9, 2);
                    SerialDescriptor descriptor = c3r9.getDescriptor();
                    C3RG BKw = descriptor.BKw();
                    if (!(BKw instanceof C3TG) && !C14360o3.A0K(BKw, C3TO.A00)) {
                        if (!z9) {
                            if (!C14360o3.A0K(BKw, C3TH.A00) && !C14360o3.A0K(BKw, C3TI.A00) && !(BKw instanceof C3RF) && !(BKw instanceof C4DE)) {
                                int B10 = descriptor.B10();
                                for (int i2 = 0; i2 < B10; i2++) {
                                    String B0v = descriptor.B0v(i2);
                                    if (C14360o3.A0K(B0v, str2)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Polymorphic serializer for ");
                                        sb.append(interfaceC16510rw);
                                        sb.append(" has property '");
                                        sb.append(B0v);
                                        sb.append("' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Serializer for ");
                                sb2.append(AbstractC13230m9.A01(((C0YZ) interfaceC16510rw).A00));
                                sb2.append(" of kind ");
                                sb2.append(BKw);
                                sb2.append(" cannot be serialized polymorphically with class discriminator.");
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Serializer for ");
                        sb3.append(AbstractC13230m9.A01(((C0YZ) interfaceC16510rw).A00));
                        sb3.append(" can't be registered as a subclass for polymorphic serialization because its kind ");
                        sb3.append(BKw);
                        sb3.append(" is not concrete. To work with multiple hierarchies, register it as a base class.");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                }
            }
            for (Map.Entry entry4 : c73803Sk2.A02.entrySet()) {
                Object key2 = entry4.getKey();
                Object value = entry4.getValue();
                C14360o3.A0C(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                C15500q5.A06(value, 1);
            }
            for (Map.Entry entry5 : c73803Sk2.A01.entrySet()) {
                Object key3 = entry5.getKey();
                Object value2 = entry5.getValue();
                C14360o3.A0C(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C14360o3.A0C(value2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                C15500q5.A06(value2, 1);
            }
        }
        return abstractC73763Sg2;
    }
}
