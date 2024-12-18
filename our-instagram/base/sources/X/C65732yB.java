package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65732yB extends AbstractC65632xz {
    public AbstractC70663Fe A00;
    public C693439u A01;
    public C685736u A02;
    public InterfaceC41501vz A03;
    public final Context A04;
    public final UserSession A05;
    public final InterfaceC63682up A06;
    public final C65742yC A07;
    public final Fragment A08;
    public final InterfaceC11380iw A09;
    public final InterfaceC63682up A0A;
    public final C63712us A0B;
    public final Integer A0C;

    public C65732yB(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC63682up interfaceC63682up, InterfaceC63682up interfaceC63682up2, C63712us c63712us, Integer num, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(fragment, 2);
        C14360o3.A0B(interfaceC63682up, 4);
        C14360o3.A0B(c63712us, 5);
        C14360o3.A0B(num, 8);
        this.A04 = context;
        this.A08 = fragment;
        this.A05 = userSession;
        this.A06 = interfaceC63682up;
        this.A0B = c63712us;
        this.A0A = interfaceC63682up2;
        this.A09 = interfaceC11380iw;
        this.A0C = num;
        this.A07 = new C65742yC(context, userSession);
        AbstractC65752yD.A00 = z;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "SuggestedUsers";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        String str = ((C47K) obj).A0F;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return str.hashCode();
        }
        return obj.hashCode();
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0321, code lost:
    
        if (X.C18U.A06(r1, r3, 36312900516120101L) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ac, code lost:
    
        r6.A0A.A11(r6.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b4, code lost:
    
        X.C0w9.A03("SuggestedUsersRowViewBinder", "item decoration not in recyclerview");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x024c, code lost:
    
        if (r0 == r13) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0151, code lost:
    
        if (r1 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0161, code lost:
    
        if (r11.A09 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0249, code lost:
    
        if (r0 == X.C05F.A01) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0237  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r36, android.view.View r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65732yB.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r5 == 1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.AnonymousClass306 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            X.47K r11 = (X.C47K) r11
            X.5Ef r12 = (X.C114385Ef) r12
            if (r11 == 0) goto L8d
            X.2yC r7 = r9.A07
            com.instagram.api.schemas.SuggestedUsersStyle r8 = X.AbstractC114375Ed.A00(r11)
            com.instagram.api.schemas.SuggestedUsersStyle r0 = r7.A01
            if (r0 == 0) goto L1a
            if (r0 == r8) goto L1a
            r0 = 0
            r7.A01 = r0
            java.util.Queue r0 = r7.A04
            r0.clear()
        L1a:
            com.instagram.api.schemas.SuggestedUsersStyle r0 = r7.A01
            if (r0 != 0) goto L7d
            r7.A01 = r8
            int r5 = r8.ordinal()
            r0 = 1
            if (r5 == r0) goto L6b
            r0 = 3
            if (r5 == r0) goto L6b
            r0 = 2
            android.content.Context r6 = r7.A02
            com.instagram.common.session.UserSession r4 = r7.A03
            X.0mD r3 = X.C65742yC.A00(r8, r7)
            if (r5 == r0) goto L65
            X.Wht r0 = new X.Wht
            r0.<init>(r7)
        L3a:
            X.0mB r0 = (X.InterfaceC13250mB) r0
            r2 = 2131628004(0x7f0e0fe4, float:1.8883288E38)
            X.5MZ r1 = new X.5MZ
            r1.<init>()
        L44:
            r3.A00(r1, r2)
            X.0mD r4 = X.C65742yC.A00(r8, r7)
            X.5Ei r3 = new X.5Ei
            r3.<init>()
            r2 = 3
            if (r5 == r2) goto L59
            r0 = 1
            r1 = 2131629568(0x7f0e1600, float:1.888646E38)
            if (r5 != r0) goto L5c
        L59:
            r1 = 2131629581(0x7f0e160d, float:1.8886487E38)
        L5c:
            r0 = 0
        L5d:
            r4.A00(r3, r1)
            int r0 = r0 + 1
            if (r0 >= r2) goto L7d
            goto L5d
        L65:
            X.5MY r0 = new X.5MY
            r0.<init>()
            goto L3a
        L6b:
            X.0mD r3 = X.C65742yC.A00(r8, r7)
            X.Whs r0 = new X.Whs
            r0.<init>(r7)
            r2 = 2131628008(0x7f0e0fe8, float:1.8883297E38)
            X.Whr r1 = new X.Whr
            r1.<init>(r0)
            goto L44
        L7d:
            r4 = 1
            r3 = 3
            r2 = 0
            if (r12 == 0) goto L8e
            boolean r0 = r12.Ceb()
            if (r0 != r4) goto L8e
            if (r10 == 0) goto L8d
            r10.A7a(r3)
        L8d:
            return
        L8e:
            com.instagram.api.schemas.SuggestedUsersStyle r0 = X.AbstractC114375Ed.A00(r11)
            int r1 = r0.ordinal()
            if (r1 == r3) goto La9
            r4 = 2
            r0 = 1
            if (r1 == r0) goto La9
            if (r10 == 0) goto La1
            r10.A7a(r2)
        La1:
            if (r12 == 0) goto L8d
            X.2up r0 = r9.A06
            r0.A9W(r11, r12)
            return
        La9:
            if (r10 == 0) goto La1
            r10.A7a(r4)
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65732yB.buildRowViewTypes(X.306, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        if (this.A03 != null) {
            AbstractC25651Mw.A00(this.A05).A02(this.A03, LYJ.class);
            this.A03 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.3Fe] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        AbstractC70663Fe A00;
        View view;
        Object c92824Dy;
        SuggestedUsersStyle suggestedUsersStyle;
        int A03 = C0f9.A03(-57023346);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        view = C693539v.A00(this.A04, viewGroup, "v1", 2);
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AnonymousClass001.A0O("Unknown viewType = ", i));
                        C0f9.A0A(754858343, A03);
                        throw illegalArgumentException;
                    }
                } else {
                    suggestedUsersStyle = SuggestedUsersStyle.A04;
                }
            } else {
                suggestedUsersStyle = SuggestedUsersStyle.A07;
            }
            C65742yC c65742yC = this.A07;
            view = c65742yC.A00;
            c65742yC.A00 = null;
            if (view == null || (view.getTag() != null && !(view.getTag() instanceof C69115Vi5))) {
                SuggestedUsersStyle suggestedUsersStyle2 = SuggestedUsersStyle.A04;
                int i2 = R.style.SuggestedUsers_WithContentThumbnail;
                if (suggestedUsersStyle == suggestedUsersStyle2) {
                    i2 = R.style.SuggestedUsers_EmbeddedWithContentThumbnail;
                }
                view = LayoutInflater.from(new ContextThemeWrapper(viewGroup.getContext(), i2)).inflate(R.layout.netego_carousel_redesign, viewGroup, false);
                C14360o3.A0A(view);
                c92824Dy = new C69115Vi5(view);
                view.setTag(c92824Dy);
            }
        } else {
            UserSession userSession = this.A05;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36316559827800583L);
            LinearLayoutManager linearLayoutManager = null;
            final Context context = this.A04;
            ?? r1 = this.A00;
            if (A06) {
                if (r1 instanceof GridLayoutManager) {
                    linearLayoutManager = r1;
                }
                A00 = new GridLayoutManager(context) { // from class: com.instagram.util.recyclerview.GridLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1
                };
                if (linearLayoutManager != null) {
                    A00.A1P(linearLayoutManager.A1M());
                }
            } else {
                if (r1 instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) r1;
                }
                A00 = AbstractC92774Dp.A00(context, linearLayoutManager, true);
            }
            this.A00 = A00;
            C65742yC c65742yC2 = this.A07;
            view = c65742yC2.A00;
            c65742yC2.A00 = null;
            if (view == null || (view.getTag() != null && !(view.getTag() instanceof C92824Dy))) {
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(context, 1);
                view = LayoutInflater.from(context).inflate(R.layout.netego_carousel, viewGroup, false);
                C14360o3.A0A(view);
                c92824Dy = new C92824Dy(context, view, userSession);
                view.setTag(c92824Dy);
            } else {
                Object tag = view.getTag();
                if (tag != null) {
                    ((C92824Dy) tag).A0A.setLayoutManager(A00);
                }
            }
        }
        C0f9.A0A(1439887763, A03);
        return view;
    }
}
