package X;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import com.facebook.R;

/* renamed from: X.9qF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221509qF extends C6RB implements InterfaceC25211BDj {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221509qF(Context context, Editable editable, C190888ck c190888ck, double d, double d2, double d3, double d4, double d5, int i) {
        super(context, i);
        C14360o3.A0B(editable, 3);
        this.A03 = d;
        this.A04 = d2;
        this.A02 = d3;
        this.A00 = d4;
        this.A01 = d5;
        AbstractC166997dE.A1B(context.getResources(), this, c190888ck.A06.A05);
        A0L(editable);
        A0K(Layout.Alignment.ALIGN_CENTER);
        A0I(AbstractC202838y1.A01(AbstractC15960qq.A00(context), c190888ck.A05));
        AbstractC190978ct.A03(editable);
        int A04 = AbstractC13950nL.A04(context.getColor(R.color.clips_remix_camera_outer_container_default_background));
        AbstractC190978ct.A02(context, C6S5.A04, c190888ck.A04, this);
        AbstractC190858ch.A03(context, editable, 0, editable.length(), context.getColor(R.color.clips_remix_camera_outer_container_default_background), A04);
        AHV.A02(context, this.A0b, editable, c190888ck, this);
    }

    @Override // X.InterfaceC25211BDj
    public final double Btc() {
        return this.A00;
    }

    @Override // X.InterfaceC25211BDj
    public final double Btd() {
        return this.A01;
    }

    @Override // X.InterfaceC25211BDj
    public final double Bte() {
        return this.A02;
    }

    @Override // X.InterfaceC25211BDj
    public final double Btf() {
        return this.A03;
    }

    @Override // X.InterfaceC25211BDj
    public final double Btg() {
        return this.A04;
    }
}
