package X;

/* renamed from: X.VXm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68611VXm {
    public static final void A00(String str, InterfaceC16510rw interfaceC16510rw) {
        StringBuilder sb;
        C14360o3.A0B(interfaceC16510rw, 1);
        Class cls = ((C0YZ) interfaceC16510rw).A00;
        String A0S = AnonymousClass001.A0S("in the polymorphic scope of '", AbstractC13230m9.A01(cls), '\'');
        if (str == null) {
            sb = new StringBuilder();
            sb.append("Class discriminator was missing and no default serializers were registered ");
            sb.append(A0S);
            sb.append('.');
        } else {
            sb = new StringBuilder();
            sb.append("Serializer for subclass '");
            sb.append(str);
            sb.append("' is not found ");
            sb.append(A0S);
            sb.append(".\nCheck if class with serial name '");
            sb.append(str);
            sb.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            sb.append(str);
            sb.append("' has to be '@Serializable', and the base class '");
            sb.append(AbstractC13230m9.A01(cls));
            sb.append("' has to be sealed and '@Serializable'.");
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
