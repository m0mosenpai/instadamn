package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.Mj2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51159Mj2 extends C2UU {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final ClipsCreationViewModel A03;
    public final Integer A04;
    public final String A05;
    public final EnumC192868gS[] A06;

    public C51159Mj2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, Integer num, String str, EnumC192868gS[] enumC192868gSArr) {
        AbstractC167007dF.A1E(enumC192868gSArr, 1, userSession);
        C14360o3.A0B(num, 6);
        this.A06 = enumC192868gSArr;
        this.A03 = clipsCreationViewModel;
        this.A01 = interfaceC11380iw;
        this.A05 = str;
        this.A04 = num;
        this.A02 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A00 = true;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C51336Mlx c51336Mlx;
        EnumC192868gS enumC192868gS;
        int i2;
        C0UO c0uo;
        int i3;
        C14360o3.A0B(c3oo, 0);
        int i4 = c3oo.mItemViewType;
        if (i4 != 0) {
            if (i4 == 1) {
                if (i > 0) {
                    int i5 = i - 1;
                    EnumC192868gS[] enumC192868gSArr = this.A06;
                    if (i5 < enumC192868gSArr.length) {
                        c51336Mlx = (C51336Mlx) c3oo;
                        enumC192868gS = enumC192868gSArr[i - 1];
                    }
                }
                throw AbstractC166987dD.A12(AbstractC111324zv.A00(23));
            }
            throw AbstractC166987dD.A12("Invalid voice effect.");
        }
        c51336Mlx = (C51336Mlx) c3oo;
        enumC192868gS = null;
        ImageView imageView = c51336Mlx.A01;
        C51159Mj2 c51159Mj2 = c51336Mlx.A04;
        imageView.setEnabled(c51159Mj2.A00);
        TextView textView = c51336Mlx.A02;
        textView.setEnabled(c51159Mj2.A00);
        if (enumC192868gS != null) {
            i2 = enumC192868gS.A02;
        } else {
            i2 = R.drawable.instagram_spark_none_outline_32;
        }
        int intValue = c51336Mlx.A05.intValue();
        if (intValue != 2 && intValue != 0) {
            c0uo = c51336Mlx.A03.A0K.A0m;
        } else {
            c0uo = c51336Mlx.A03.A0K.A0c;
        }
        if (enumC192868gS == c0uo.getValue() && c51159Mj2.A00) {
            imageView.setImageDrawable(AE1.A00(AbstractC37301Gc2.A03(c51336Mlx), i2));
            c51336Mlx.A00.setVisibility(0);
            c51336Mlx.itemView.setSelected(true);
        } else {
            imageView.setImageResource(i2);
            c51336Mlx.itemView.setSelected(false);
            c51336Mlx.A00.setVisibility(8);
        }
        Context A05 = AbstractC31172DnG.A05(c51336Mlx);
        if (enumC192868gS != null) {
            i3 = enumC192868gS.A03;
        } else {
            i3 = 2131969846;
        }
        AbstractC166987dD.A1P(A05, textView, i3);
        ViewOnClickListenerC55464OkJ.A01(c51336Mlx.itemView, 56, c51336Mlx, enumC192868gS);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0R = AbstractC25226BEj.A0R(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_voice_effects_grid_item, false);
        if (i != 0 && i != 1) {
            throw AbstractC166987dD.A12("Invalid voice effect.");
        }
        return new C51336Mlx(A0R, this.A03, this, this.A04);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-383550324);
        int length = this.A06.length + 1;
        C0f9.A0A(1302778806, A03);
        return length;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        C0f9.A0A(-1116542772, C0f9.A03(779194615));
        return 0L;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1609086981);
        boolean A1Q = AbstractC25230BEn.A1Q(i);
        C0f9.A0A(593538471, A03);
        return A1Q ? 1 : 0;
    }
}
