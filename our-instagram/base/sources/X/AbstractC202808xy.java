package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.util.TypedValue;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.8xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202808xy {
    public static final void A02(Activity activity, UserSession userSession, C202668xk c202668xk, InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        int i2;
        C14360o3.A0B(activity, 1);
        AbstractC23021Ah.A00(userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36322924969339629L)) {
            C5SU c5su = new C5SU(activity, new C149686oL(i));
            int applyDimension = (int) TypedValue.applyDimension(1, -185.0f, activity.getResources().getDisplayMetrics());
            if (c202668xk != null) {
                i2 = c202668xk.A02;
            } else {
                i2 = 0;
            }
            c5su.A05(new C207559Gj(interactiveDrawableContainer, 0, i2 - applyDimension, true));
            c5su.A01();
            interactiveDrawableContainer.postDelayed(new RunnableC24644Ave(userSession, c5su.A00()), 500L);
        }
    }

    public static final void A05(C1830289x c1830289x, InteractiveDrawableContainer interactiveDrawableContainer) {
        C14360o3.A0B(c1830289x, 0);
        C14360o3.A0B(interactiveDrawableContainer, 1);
        ArrayList A0T = interactiveDrawableContainer.A0T(C202668xk.class);
        if (A0T.size() == 1) {
            c1830289x.A01(new C23779Afq((Drawable) A0T.get(0), interactiveDrawableContainer));
        }
    }

    public static final void A06(InteractiveDrawableContainer interactiveDrawableContainer, boolean z) {
        String str;
        C14360o3.A0B(interactiveDrawableContainer, 0);
        C202668xk c202668xk = (C202668xk) AbstractC001800i.A0J(interactiveDrawableContainer.A0T(C202668xk.class));
        if (c202668xk != null) {
            c202668xk.setVisible(z, false);
            if (z) {
                str = "reel_mention_post";
            } else {
                str = "reel_mention_post_fullscreen_photo";
            }
            c202668xk.A00 = str;
        }
        Drawable drawable = (Drawable) AbstractC001800i.A0J(interactiveDrawableContainer.A0T(C210169Rf.class));
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public static final boolean A07(Context context, UserSession userSession, C1815783k c1815783k, InteractiveDrawableContainer interactiveDrawableContainer, float f, float f2, float f3, float f4) {
        if (c1815783k != null && c1815783k.A02 && f > 0.0f && f < f3 && f2 > 0.0f && f2 < f4) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36322924969339629L)) {
                InterfaceC19630xq interfaceC19630xq = A00.A01;
                if (interfaceC19630xq.getInt("immersive_mention_reshare_tooltip_tap_count", 0) < 1) {
                    C202668xk c202668xk = (C202668xk) AbstractC001800i.A0J(interactiveDrawableContainer.A0T(C202668xk.class));
                    C14360o3.A0C(context, AbstractC43591JPw.A00(4));
                    Activity activity = (Activity) context;
                    int i = 2131972468;
                    if (C14360o3.A0K(c1815783k.A05.A02(), true)) {
                        i = 2131972467;
                    }
                    A02(activity, userSession, c202668xk, interactiveDrawableContainer, i);
                    A00.A0z("immersive_mention_reshare_tooltip_tap_count", interfaceC19630xq.getInt("immersive_mention_reshare_tooltip_tap_count", 0) + 1);
                    return true;
                }
            }
            if (!C18U.A06(c06090Tz, userSession, 36322924969339629L)) {
                if (AbstractC23021Ah.A00(userSession).A21()) {
                    c1815783k.A01();
                    A06(interactiveDrawableContainer, true);
                    return true;
                }
                c1815783k.A00();
                A06(interactiveDrawableContainer, false);
                return true;
            }
        }
        return false;
    }

    public static final Drawable A00(Context context, UserSession userSession, C1815783k c1815783k, String str) {
        if (c1815783k.A09 != null) {
            C57332k8 A00 = C57332k8.A0m.A00(context, userSession);
            C38321qM c38321qM = c1815783k.A07;
            String BqK = c38321qM.BqK();
            LruCache lruCache = A00.A0G;
            Drawable drawable = (Drawable) lruCache.get(BqK);
            if (drawable == null) {
                Resources resources = context.getResources();
                ArrayList arrayList = new ArrayList();
                User[] userArr = {c38321qM.A0C.BAR(), c38321qM.A2E(A00.A0J)};
                C14360o3.A0B(userArr, 0);
                arrayList.addAll(AbstractC009903n.A0I(userArr));
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
                Drawable A002 = AbstractC89513yr.A00(context, null, Float.valueOf(0.4f), C05F.A0C, null, Integer.valueOf(resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin)), Integer.valueOf(resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin)), null, str, arrayList, dimensionPixelSize, false, true, false, true, false);
                lruCache.put(BqK, A002);
                return A002;
            }
            return drawable;
        }
        return null;
    }

    public static final String A01(Context context, C1815783k c1815783k) {
        if (c1815783k.A09 != null) {
            return context.getString(2131963366, c1815783k.A0A.getUsername());
        }
        return null;
    }

    public static final void A03(Drawable drawable, C89F c89f, float f) {
        if (drawable instanceof C210399Se) {
            ((C210399Se) drawable).A03 = new C206169Az(f);
            if (c89f != null) {
                C206169Az c206169Az = new C206169Az(f);
                if (c89f.A0B()) {
                    c89f.A0U.A01(c206169Az.A02, c206169Az.A03, c206169Az.A00, c206169Az.A01);
                    return;
                }
                return;
            }
            return;
        }
        if (!(drawable instanceof C8FY)) {
            return;
        }
        ((C8FY) drawable).A02(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r19.A0E == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(com.instagram.common.session.UserSession r16, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r17, X.C1830289x r18, X.C1815783k r19, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r20, java.lang.String r21) {
        /*
            r4 = r17
            r1 = 0
            r5 = r18
            X.C14360o3.A0B(r5, r1)
            r0 = 1
            r2 = r20
            X.C14360o3.A0B(r2, r0)
            r3 = 3
            X.C14360o3.A0B(r4, r3)
            r3 = 5
            r7 = r21
            X.C14360o3.A0B(r7, r3)
            android.content.Context r9 = r2.getContext()
            r3 = r19
            boolean r6 = r3.A0D
            if (r6 == 0) goto L28
            boolean r6 = r3.A0E
            r20 = 1
            if (r6 != 0) goto L2a
        L28:
            r20 = 0
        L2a:
            X.C14360o3.A0A(r9)
            com.instagram.user.model.User r12 = r3.A09
            if (r12 != 0) goto L33
            com.instagram.user.model.User r12 = r3.A0A
        L33:
            java.lang.String r14 = r3.A0C
            r11 = 0
            X.C14360o3.A0B(r9, r0)
            r6 = 2
            X.C14360o3.A0B(r12, r6)
            android.content.res.Resources r8 = r9.getResources()
            r6 = 2131165193(0x7f070009, float:1.7944596E38)
            int r17 = r8.getDimensionPixelSize(r6)
            r6 = 2131165567(0x7f07017f, float:1.7945355E38)
            int r18 = r8.getDimensionPixelSize(r6)
            r6 = 2131165218(0x7f070022, float:1.7944647E38)
            int r15 = r8.getDimensionPixelSize(r6)
            r6 = r16
            android.graphics.drawable.Drawable r10 = A00(r9, r6, r3, r7)
            java.lang.String r13 = A01(r9, r3)
            X.8xk r8 = new X.8xk
            r16 = r15
            r19 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r7 = r3.A04
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r4 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r4
            X.82f r4 = r4.A0K
            int r3 = r4.getWidth()
            float r6 = (float) r3
            int r3 = r4.getHeight()
            float r4 = (float) r3
            r3 = 1056964608(0x3f000000, float:0.5)
            X.AGw r4 = X.A06.A00(r7, r6, r4, r3, r1)
            X.8FC r3 = new X.8FC
            r3.<init>(r4)
            r7 = r2
            r9 = r3
            r10 = r1
            r11 = r1
            r12 = r1
            r7.A0J(r8, r9, r10, r11, r12)
            X.Afq r3 = new X.Afq
            r3.<init>(r8, r2)
            r5.A01(r3)
            java.lang.Class<X.8xk> r3 = X.C202668xk.class
            java.util.ArrayList r4 = r2.A0T(r3)
            int r3 = r4.size()
            if (r3 != r0) goto Lae
            java.lang.Object r1 = r4.get(r1)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            X.Afq r0 = new X.Afq
            r0.<init>(r1, r2)
            r5.A01(r0)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC202808xy.A04(com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.89x, X.83k, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.String):void");
    }
}
