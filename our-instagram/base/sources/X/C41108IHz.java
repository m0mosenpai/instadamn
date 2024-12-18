package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.IHz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41108IHz {
    public final ImmutableList A00;
    public final ICC A01;
    public final EnumC53296NhY A02;
    public final String A03;

    public C41108IHz(C41105IHw c41105IHw) {
        ICC icc;
        this.A03 = c41105IHw.A02;
        this.A00 = AbstractC31173DnH.A0L(c41105IHw.A03);
        this.A02 = c41105IHw.A01;
        ICD icd = c41105IHw.A00;
        if (icd != null) {
            icc = icd.A00;
        } else {
            icc = null;
        }
        this.A01 = icc;
    }
}
