package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class T7i implements C2n2 {
    public static final T7i A00 = new T7i();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C2JS reinterpretRequired;
        C2JS optionalTreeField;
        C2JS c2js = (C2JS) obj;
        if (c2js != null && (reinterpretRequired = c2js.reinterpretRequired(0, QTG.class, 609878843)) != null && (optionalTreeField = reinterpretRequired.getOptionalTreeField(0, "get_server_encryption_key_logged_out(data:$data)", QTF.class, 349832712)) != null) {
            ImmutableList requiredCompactedStringListField = optionalTreeField.getRequiredCompactedStringListField(2, "trust_chain");
            C14360o3.A07(requiredCompactedStringListField);
            return requiredCompactedStringListField;
        }
        throw new C64863TXo(0, "", "No server key response.");
    }
}
