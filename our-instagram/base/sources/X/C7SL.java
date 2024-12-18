package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;

/* renamed from: X.7SL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SL implements C7QD {
    public final C57012jc A00;
    public final InterfaceC165537ag A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    private final void A00(IgdsBulletCell igdsBulletCell, String str, String str2, int i, int i2) {
        if (str != null) {
            igdsBulletCell.setText(str2, str);
            igdsBulletCell.setIcon(i);
            igdsBulletCell.setIconColor(i2);
            igdsBulletCell.setVisibility(0);
            C57012jc c57012jc = this.A00;
            if (c57012jc.A00() == 8) {
                c57012jc.A03(0);
                return;
            }
            return;
        }
        igdsBulletCell.setVisibility(8);
    }

    public final void A01(C7BV c7bv) {
        Object value = this.A05.getValue();
        C14360o3.A07(value);
        String str = c7bv.A07;
        A00((IgdsBulletCell) value, str, c7bv.A06, R.drawable.instagram_arrow_right_pano_outline_24, R.color.badge_color);
        Object value2 = this.A04.getValue();
        C14360o3.A07(value2);
        A00((IgdsBulletCell) value2, c7bv.A05, c7bv.A04, R.drawable.instagram_arrow_left_pano_outline_24, R.color.green_5);
        Object value3 = this.A03.getValue();
        C14360o3.A07(value3);
        A00((IgdsBulletCell) value3, c7bv.A02, c7bv.A03, R.drawable.instagram_timer_pano_outline_24, R.color.clips_gradient_redesign_color_1);
        Object value4 = this.A02.getValue();
        C14360o3.A07(value4);
        A00((IgdsBulletCell) value4, c7bv.A00, c7bv.A01, R.drawable.instagram_error_pano_outline_24, R.color.netego_su_background_gradient_end_4);
        Object value5 = this.A08.getValue();
        C14360o3.A07(value5);
        A00((IgdsBulletCell) value5, str, c7bv.A0D, R.drawable.instagram_arrow_right_pano_outline_24, R.color.badge_color);
        Object value6 = this.A07.getValue();
        C14360o3.A07(value6);
        A00((IgdsBulletCell) value6, c7bv.A0C, c7bv.A0B, R.drawable.instagram_arrow_left_pano_outline_24, R.color.green_5);
        Object value7 = this.A06.getValue();
        C14360o3.A07(value7);
        A00((IgdsBulletCell) value7, c7bv.A09, c7bv.A0A, R.drawable.instagram_timer_pano_outline_24, R.color.clips_gradient_redesign_color_1);
        Object value8 = this.A09.getValue();
        C14360o3.A07(value8);
        C0fQ.A00(new ViewOnClickListenerC23216ARa(this, c7bv), (View) value8);
    }

    @Override // X.C7QD
    public final View BKF() {
        View view;
        C57012jc c57012jc = this.A00;
        if (c57012jc.A00 != null) {
            view = c57012jc.A01();
        } else {
            view = c57012jc.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7SL(C57012jc c57012jc, InterfaceC165537ag interfaceC165537ag) {
        this.A00 = c57012jc;
        this.A01 = interfaceC165537ag;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 45));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 44));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 43));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 42));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 48));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 47));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 46));
        this.A09 = AbstractC09440dt.A01(new C9E8(this, 49));
    }
}
