package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.8yE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202968yE {
    public Integer A00;
    public final ImageView A01;
    public final ConstrainedEditText A02;
    public final UserSession A03;
    public final InterfaceC190418bz A04;

    public C202968yE(View view, View view2, UserSession userSession, InterfaceC190418bz interfaceC190418bz, Integer num, int i, int i2) {
        C14360o3.A0B(num, 5);
        this.A00 = num;
        this.A04 = interfaceC190418bz;
        this.A03 = userSession;
        View findViewById = view.findViewById(i);
        C14360o3.A07(findViewById);
        this.A02 = (ConstrainedEditText) findViewById;
        View findViewById2 = view2.findViewById(i2);
        C14360o3.A07(findViewById2);
        ImageView imageView = (ImageView) findViewById2;
        this.A01 = imageView;
        C3P9 c3p9 = new C3P9(imageView);
        c3p9.A04 = new C3PD() { // from class: X.8yF
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view3) {
                Integer num2;
                C202968yE c202968yE = C202968yE.this;
                int intValue = c202968yE.A00.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            num2 = C05F.A01;
                        }
                        return true;
                    }
                    num2 = C05F.A00;
                } else {
                    num2 = C05F.A0C;
                }
                c202968yE.A00(num2);
                return true;
            }
        };
        c3p9.A00();
    }

    public final void A00(Integer num) {
        ImageView imageView;
        Context context;
        int i;
        C14360o3.A0B(num, 0);
        if (num != this.A00) {
            this.A00 = num;
            ConstrainedEditText constrainedEditText = this.A02;
            int intValue = num.intValue();
            int i2 = 3;
            if (intValue != 0) {
                i2 = 1;
                if (intValue != 1) {
                    if (intValue == 2) {
                        i2 = 5;
                    } else {
                        throw new IllegalStateException(AnonymousClass001.A0R("Unknown alignment: ", AbstractC23070AFc.A00(num)));
                    }
                }
            }
            constrainedEditText.setGravity(i2);
            AnonymousClass229.A01(this.A03).A1v(AbstractC23070AFc.A00(this.A00));
            int intValue2 = num.intValue();
            if (intValue2 != 0) {
                if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        imageView = this.A01;
                        imageView.setImageResource(R.drawable.instagram_align_right_outline_44);
                        context = imageView.getContext();
                        i = 2131975286;
                    }
                    this.A04.Dsa(num);
                }
                imageView = this.A01;
                imageView.setImageResource(R.drawable.instagram_align_center_outline_44);
                context = imageView.getContext();
                i = 2131975284;
            } else {
                imageView = this.A01;
                imageView.setImageResource(R.drawable.instagram_align_left_outline_44);
                context = imageView.getContext();
                i = 2131975285;
            }
            imageView.setContentDescription(context.getString(i));
            this.A04.Dsa(num);
        }
    }
}
