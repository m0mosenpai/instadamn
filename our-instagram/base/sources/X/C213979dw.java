package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213979dw extends C2JS implements InterfaceC174127p4 {
    @Override // X.InterfaceC174127p4
    public final int B6J() {
        return getCoercedIntField(5, "filesize_bytes");
    }

    @Override // X.InterfaceC174127p4
    public final boolean BJi() {
        return getCoercedBooleanField(7, "is_encrypted");
    }

    @Override // X.InterfaceC174127p4
    public final int CCM() {
        return getCoercedIntField(6, "uncompressed_filesize_bytes");
    }

    @Override // X.InterfaceC174127p4
    public final String AjY() {
        return A09("cache_key");
    }

    @Override // X.InterfaceC174127p4
    public final EnumC174137p5 Aq6() {
        return (EnumC174137p5) getOptionalEnumField(3, TraceFieldType.CompressionType, EnumC174137p5.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.InterfaceC174127p4
    public final ImmutableList B0T() {
        return getRequiredCompactedTreeListField(8, "effect_file_contents", C213969dv.class, -1153896853);
    }

    @Override // X.InterfaceC174127p4
    public final String BQJ() {
        return A0B("md5_hash");
    }

    @Override // X.InterfaceC174127p4
    public final String getId() {
        return A07("strong_id__");
    }

    @Override // X.InterfaceC174127p4
    public final String getUri() {
        return A08("uri");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0V = AbstractC166997dE.A0V(c94754Oe);
        C4OW A0i = AbstractC166987dD.A0i(c94754Oe, "uri");
        C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "cache_key");
        C4OW A0i3 = AbstractC166987dD.A0i(c94754Oe, TraceFieldType.CompressionType);
        C4OW A0i4 = AbstractC166987dD.A0i(c94754Oe, "md5_hash");
        C94894Ou c94894Ou = C94894Ou.A00;
        return AbstractC166987dD.A0k(new C4OM[]{A0V, A0i, A0i2, A0i3, A0i4, AbstractC166987dD.A0i(c94894Ou, "filesize_bytes"), AbstractC166987dD.A0i(c94894Ou, "uncompressed_filesize_bytes"), AbstractC166987dD.A0i(C95124Py.A00, "is_encrypted"), AbstractC166987dD.A0h(C4OO.A02(), C213969dv.class, "effect_file_contents", -1153896853)});
    }

    public C213979dw(int i) {
        super(i);
    }

    public C213979dw() {
        super(-1040728851);
    }
}
