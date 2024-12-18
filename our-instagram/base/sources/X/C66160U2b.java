package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import java.util.List;

/* renamed from: X.U2b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66160U2b {
    public static final C66160U2b A00 = new Object();

    public static final void A02(C66362zD c66362zD, C69727VuM c69727VuM, C66483UJj c66483UJj, float f, float f2, float f3) {
        int i;
        RecyclerView recyclerView = c66483UJj.A05;
        AbstractC31174DnI.A17(c66483UJj.A01.getContext(), recyclerView, false);
        recyclerView.setAdapter(c66362zD);
        C2UU c2uu = recyclerView.A0A;
        C14360o3.A0C(c2uu, MSV.A00(60));
        C66362zD c66362zD2 = (C66362zD) c2uu;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        List list = c69727VuM.A08;
        if (list == null) {
            int i2 = 0;
            do {
                viewModelListUpdate.A00(new WhC(f3));
                i2++;
            } while (i2 < 5);
        } else {
            UP8 up8 = c69727VuM.A00().A00;
            if (up8 != null) {
                i = up8.A03;
            } else {
                i = 6;
            }
            int i3 = 0;
            for (Object obj : AbstractC001800i.A0d(list, i)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C38321qM c38321qM = (C38321qM) obj;
                if (c38321qM.getId() != null) {
                    C5qT c5qT = new C5qT(0, i3);
                    float f4 = f;
                    if (c38321qM.Cff()) {
                        f4 = f2;
                    }
                    viewModelListUpdate.A00(new HKZ(c5qT, c38321qM, f4));
                    i3 = i4;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        c66362zD2.A05(viewModelListUpdate);
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = c66483UJj.A0H;
        Context context = roundedCornerConstraintLayout.getContext();
        int A03 = AbstractC167017dG.A03(context);
        int A05 = AbstractC167017dG.A05(context);
        if (recyclerView.A12.size() == 0) {
            recyclerView.A10(new C3YB(A05, A05));
        }
        recyclerView.setVisibility(0);
        roundedCornerConstraintLayout.setPadding(0, A03, 0, A03);
    }

    public final void A03(TextView textView, String str) {
        C14360o3.A0B(textView, 0);
        if (str != null && str.length() != 0) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r30.size() < 3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.InterfaceC11380iw r27, com.instagram.common.session.UserSession r28, X.C66483UJj r29, java.util.List r30) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66160U2b.A04(X.0iw, com.instagram.common.session.UserSession, X.UJj, java.util.List):void");
    }

    public static final int A00(C66483UJj c66483UJj) {
        Context context = c66483UJj.itemView.getContext();
        C14360o3.A0A(context);
        return (AbstractC13880nE.A0A(context) - (AbstractC167017dG.A03(context) * 2)) - (context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing) * 2);
    }

    public static final void A01(Drawable drawable, C66483UJj c66483UJj) {
        Integer num = C05F.A00;
        if (c66483UJj.A00 != num) {
            c66483UJj.A09.setVisibility(0);
            c66483UJj.A0F.setVisibility(8);
            c66483UJj.A00 = num;
        }
        IgImageView A002 = c66483UJj.A00();
        A002.setImageDrawable(drawable);
        Context context = c66483UJj.A00().getContext();
        Context context2 = A002.getContext();
        AbstractC31177DnL.A0p(context, A002, AbstractC53242c7.A08(context2));
        int A03 = AbstractC167017dG.A03(context2);
        A002.setPadding(A03, A03, A03, A03);
    }
}
