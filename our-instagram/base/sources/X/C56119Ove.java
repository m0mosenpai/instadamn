package X;

import android.view.View;
import java.util.List;

/* renamed from: X.Ove, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56119Ove implements InterfaceC66482zP {
    public final View.OnClickListener A00;
    public final EPU A01;
    public final InterfaceC190658cN A02;
    public final CharSequence A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0R("video_metadata_sharing_", this.A04);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56119Ove c56119Ove = (C56119Ove) obj;
        C14360o3.A0B(c56119Ove, 0);
        if (AbstractC50102Ry.A00(this.A04, c56119Ove.A04) && AbstractC50102Ry.A00(this.A03, c56119Ove.A03) && AbstractC50102Ry.A00(this.A06, c56119Ove.A06) && AbstractC50102Ry.A00(Boolean.valueOf(this.A0A), Boolean.valueOf(c56119Ove.A0A)) && this.A07 == c56119Ove.A07 && AbstractC50102Ry.A00(this.A02, c56119Ove.A02) && AbstractC50102Ry.A00(this.A01, c56119Ove.A01) && AbstractC50102Ry.A00(Boolean.valueOf(this.A08), Boolean.valueOf(c56119Ove.A08)) && AbstractC50102Ry.A00(this.A00, c56119Ove.A00) && AbstractC50102Ry.A00(this.A05, c56119Ove.A05) && AbstractC50102Ry.A00(Boolean.valueOf(this.A09), Boolean.valueOf(c56119Ove.A09))) {
            return true;
        }
        return false;
    }

    public C56119Ove(View.OnClickListener onClickListener, EPU epu, InterfaceC190658cN interfaceC190658cN, CharSequence charSequence, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = str;
        this.A03 = charSequence;
        this.A06 = list;
        this.A0A = z;
        this.A07 = z2;
        this.A02 = interfaceC190658cN;
        this.A01 = epu;
        this.A08 = z3;
        this.A00 = onClickListener;
        this.A05 = str2;
        this.A09 = z4;
    }
}
