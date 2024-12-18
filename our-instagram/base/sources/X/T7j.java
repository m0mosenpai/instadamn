package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class T7j implements C2n2 {
    public static final T7j A00 = new T7j();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C2JS reinterpretRequired;
        C2JS optionalTreeField;
        C2JS c2js = (C2JS) obj;
        if (c2js != null && (reinterpretRequired = c2js.reinterpretRequired(0, QTK.class, -830474888)) != null && (optionalTreeField = reinterpretRequired.getOptionalTreeField(0, "get_server_encryption_key(data:$input)", QTJ.class, -200021125)) != null) {
            ImmutableList requiredCompactedStringListField = optionalTreeField.getRequiredCompactedStringListField(2, "trust_chain");
            C14360o3.A07(requiredCompactedStringListField);
            return requiredCompactedStringListField;
        }
        throw new C64863TXo(0, "", "No server key response.");
    }
}
