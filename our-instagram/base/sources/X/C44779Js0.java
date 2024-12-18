package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Js0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44779Js0 extends C3OO implements C7QD {
    public final Drawable A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final ViewGroup A03;
    public final TextView A04;
    public final IgImageView A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44779Js0(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, TextView textView, IgImageView igImageView) {
        super(viewGroup);
        AbstractC25233BEq.A0x(3, viewGroup2, viewGroup3, igImageView);
        this.A04 = textView;
        this.A03 = viewGroup;
        this.A01 = viewGroup2;
        this.A02 = viewGroup3;
        this.A05 = igImageView;
        this.A00 = AbstractC162807Qr.A00();
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A03;
    }
}
