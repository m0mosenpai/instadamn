package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.user.model.User;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class ES9 extends AbstractC65632xz {
    public C38321qM A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC11380iw A03;

    public ES9(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = interfaceC11380iw;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return obj.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((FMZ) obj).A00;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r1 != true) goto L6;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r10, android.view.View r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r9 = this;
            r0 = 1645688389(0x62173645, float:6.973422E20)
            int r3 = X.C0f9.A03(r0)
            r2 = 1
            X.AbstractC167007dF.A1D(r11, r2, r12)
            X.FMZ r12 = (X.FMZ) r12
            int r8 = r12.A00
            java.lang.Object r7 = X.AbstractC31172DnG.A0x(r11)
            X.FLU r7 = (X.FLU) r7
            X.1qM r0 = r9.A00
            r6 = 0
            if (r0 == 0) goto L23
            boolean r1 = r0.A4a()
            r0 = 2131238331(0x7f081dbb, float:1.8092938E38)
            if (r1 == r2) goto L26
        L23:
            r0 = 2131238716(0x7f081f3c, float:1.8093719E38)
        L26:
            android.widget.TextView r4 = r7.A02
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r6, r6, r6)
            X.1qM r0 = r9.A00
            if (r0 == 0) goto L6b
            boolean r0 = r0.A4a()
            if (r0 != r2) goto L6b
            r5 = 2131968662(0x7f134296, float:1.9574225E38)
            android.content.Context r2 = r9.A01
            android.content.res.Resources r1 = X.AbstractC166997dE.A0M(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = X.AbstractC74053Tw.A03(r1, r0, r5)
        L46:
            r4.setText(r0)
            int r1 = X.AbstractC53242c7.A07(r2)
            android.util.TypedValue r0 = X.AbstractC85953sP.A00
            android.content.Context r0 = r4.getContext()
            int r8 = r0.getColor(r1)
            android.graphics.drawable.Drawable[] r5 = r4.getCompoundDrawablesRelative()
            int r4 = r5.length
            r2 = 0
        L5d:
            if (r2 >= r4) goto L7a
            r1 = r5[r2]
            if (r1 == 0) goto L68
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.AbstractC25228BEl.A1H(r0, r1, r8)
        L68:
            int r2 = r2 + 1
            goto L5d
        L6b:
            android.content.Context r2 = r9.A01
            android.content.res.Resources r1 = X.AbstractC166997dE.A0M(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = X.AbstractC74053Tw.A02(r1, r0)
            goto L46
        L7a:
            android.widget.ImageView r0 = r7.A00
            r2 = 8
            r0.setVisibility(r2)
            boolean r0 = r12.A02
            if (r0 == 0) goto L98
            java.lang.CharSequence r1 = r12.A01
            if (r1 == 0) goto L98
            android.widget.TextView r0 = r7.A01
            r0.setText(r1)
            r0.setVisibility(r6)
        L91:
            r0 = -1091008572(0xffffffffbef887c4, float:-0.4854108)
            X.C0f9.A0A(r0, r3)
            return
        L98:
            android.widget.TextView r0 = r7.A01
            r0.setVisibility(r2)
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ES9.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        User user;
        int A03 = C0f9.A03(1154235552);
        C14360o3.A0B(viewGroup, 1);
        Context context = this.A01;
        View inflate = LayoutInflater.from(context).inflate(R.layout.play_count_header_row, viewGroup, false);
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321726673659685L) && this.A00 != null) {
            User A10 = AbstractC166987dD.A10(userSession);
            C38321qM c38321qM = this.A00;
            if (c38321qM != null) {
                user = c38321qM.A2E(userSession);
            } else {
                user = null;
            }
            if (A10.equals(user)) {
                C1AU A01 = C1AT.A01(userSession);
                C1AV c1av = C1AV.A1u;
                if (!A01.A03(c1av).getBoolean("PLAYCOUNT_WITH_REPLAY_BANNER_DISMISSED_BY_USER", false) && C1AT.A01(userSession).A03(c1av).getInt("PLAYCOUNT_WITH_REPLAY_BANNER_IMPRESSION_COUNT", 0) < 3) {
                    IgLinearLayout igLinearLayout = new IgLinearLayout(context);
                    igLinearLayout.setOrientation(1);
                    igLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    IgdsBanner igdsBanner = new IgdsBanner(context, null, 0);
                    AbstractC31174DnI.A1D(igdsBanner, -1, -2);
                    Locale locale = Locale.getDefault();
                    C14360o3.A07(locale);
                    C34719FRg c34719FRg = new C34719FRg(context, locale);
                    ThreadLocal threadLocal = c34719FRg.A08;
                    DateFormat dateFormat = (DateFormat) threadLocal.get();
                    DateFormat dateFormat2 = dateFormat;
                    if (dateFormat == null) {
                        Object clone = c34719FRg.A00().clone();
                        C14360o3.A0C(clone, "null cannot be cast to non-null type java.text.SimpleDateFormat");
                        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) clone;
                        simpleDateFormat.applyPattern(android.text.format.DateFormat.getBestDateTimePattern(c34719FRg.A0J, "MMMd"));
                        threadLocal.set(simpleDateFormat);
                        dateFormat2 = simpleDateFormat;
                    }
                    String A0r = AbstractC166997dE.A0r(context.getResources(), dateFormat2.format(new Date(C18U.A01(c06090Tz, userSession, 36603201650234269L) * 1000)), 2131969679);
                    C14360o3.A07(A0r);
                    String A0q = AbstractC166997dE.A0q(context.getResources(), 2131969680);
                    AbstractC31172DnG.A1U(igdsBanner, A0r, false);
                    igdsBanner.setAction(A0q);
                    igdsBanner.setDismissible(true);
                    G81.A00(igdsBanner, this, 14);
                    igLinearLayout.addView(igdsBanner, 0);
                    C14360o3.A0A(inflate);
                    igLinearLayout.setTag(new FLU(inflate));
                    igLinearLayout.addView(inflate, 1);
                    AbstractC167017dG.A0g(C1AT.A01(userSession).A03(c1av), "PLAYCOUNT_WITH_REPLAY_BANNER_IMPRESSION_COUNT").apply();
                    C38321qM c38321qM2 = this.A00;
                    if (c38321qM2 != null) {
                        InterfaceC11380iw interfaceC11380iw = this.A03;
                        C14360o3.A0B(userSession, 0);
                        C14360o3.A0B(interfaceC11380iw, 1);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_play_count_banner_impression");
                        if (A0f.isSampled()) {
                            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
                            String A38 = c38321qM2.A38();
                            if (A38 != null) {
                                AbstractC25236BEt.A0r(A0f, A38);
                                User A2E = c38321qM2.A2E(userSession);
                                if (A2E != null) {
                                    A0f.A9K("media_author_id", AbstractC25228BEl.A13(A2E.getId()));
                                    A0f.A8p(AbstractC111324zv.A00(233), 0);
                                    A0f.AAP("viewer_session_id", "");
                                    A0f.AAP("ranking_info_token", AbstractC25226BEj.A1G(c38321qM2));
                                    A0f.AAP(AbstractC111324zv.A00(183), null);
                                    A0f.AAP("nav_chain", null);
                                    A0f.Cht();
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                    inflate = igLinearLayout;
                    C0f9.A0A(2133981600, A03);
                    return inflate;
                }
            }
        }
        C14360o3.A0A(inflate);
        inflate.setTag(new FLU(inflate));
        C0f9.A0A(2133981600, A03);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
