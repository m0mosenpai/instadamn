package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.5iT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123545iT extends C2UU {
    public RecyclerView A00;
    public C147036jf A01;
    public C69225Vjt A02;
    public C47K A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Activity A08;
    public final Context A09;
    public final View A0A;
    public final InterfaceC11380iw A0B;
    public final UserSession A0C;
    public final InterfaceC63682up A0D;
    public final C114385Ef A0E;
    public final C63712us A0F;
    public final C123835ix A0G;
    public final Integer A0H;
    public final Runnable A0I;
    public final java.util.Set A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final int A0M;
    public final C25671My A0N;
    public final C1GL A0O;
    public final C65742yC A0P;

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                View inflate = LayoutInflater.from(this.A09).inflate(R.layout.suggested_upsell_card, viewGroup, false);
                inflate.getLayoutParams().width = this.A0M;
                UJV ujv = new UJV(inflate);
                Integer num = this.A0H;
                AbstractC126205nH.A00(ujv.A00, ujv.A05, null, ujv.A03, num, true);
                return ujv;
            }
            throw new IllegalStateException(AnonymousClass001.A0O(MSV.A00(27), i));
        }
        View view = (View) this.A0P.A04.poll();
        if (view == null || view.findViewById(R.id.suggested_entity_card_chaining_context) == null) {
            view = LayoutInflater.from(this.A09).inflate(R.layout.suggested_entity_card, viewGroup, false);
        }
        if (view != null) {
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new C3OP(this.A0M, -1));
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = this.A0M;
                }
            }
        }
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Context context = this.A09;
        InterfaceC11380iw interfaceC11380iw = this.A0B;
        C1GL c1gl = this.A0O;
        UserSession userSession = this.A0C;
        C14360o3.A0A(view);
        C126185nF c126185nF = new C126185nF(context, view, interfaceC11380iw, userSession, c1gl);
        Integer num2 = this.A0H;
        AbstractC126205nH.A00(c126185nF.A01, c126185nF.A09, c126185nF.A06, c126185nF.A08, num2, false);
        return c126185nF;
    }

    public C123545iT(Activity activity, Context context, View view, UserSession userSession, C1GL c1gl, InterfaceC63682up interfaceC63682up, C65742yC c65742yC, C114385Ef c114385Ef, C63712us c63712us, Integer num, Runnable runnable, boolean z, boolean z2) {
        C14360o3.A0B(num, 8);
        this.A09 = context;
        this.A08 = activity;
        this.A0O = c1gl;
        this.A0C = userSession;
        this.A0D = interfaceC63682up;
        this.A0P = c65742yC;
        this.A0F = c63712us;
        this.A0H = num;
        this.A0A = view;
        this.A0E = c114385Ef;
        this.A0K = z;
        this.A0L = z2;
        this.A0I = runnable;
        InterfaceC11380iw Abd = interfaceC63682up.Abd();
        this.A0B = Abd;
        this.A0N = AbstractC25651Mw.A00(userSession);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        this.A0M = AbstractC123565iV.A00(resources, num, AbstractC13880nE.A0A(context));
        this.A0G = new C123835ix(Abd, userSession);
        this.A0J = new HashSet();
    }

    public static final String A00(C123545iT c123545iT) {
        C47K c47k = c123545iT.A03;
        if (c47k != null) {
            int ordinal = c47k.B5n().ordinal();
            if (ordinal != 5) {
                if (ordinal == 7) {
                    return "feed_suggested_producers_netego";
                }
            } else {
                return "feed_suggested_users_netego";
            }
        }
        return c123545iT.A0B.getModuleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
    public static final void A01(C123545iT c123545iT, int i) {
        List list;
        C47K c47k = c123545iT.A03;
        if (c47k != null && (list = c47k.A0P) != null) {
            list.remove(i);
        }
        c123545iT.notifyItemRemoved(i);
        if (c123545iT.getItemCount() == 0) {
            c123545iT.A0N.E4s(new Object());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0219, code lost:
    
        if (r3 == X.C1XV.A0r) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0064, code lost:
    
        if (r1 == X.C1XV.A0r) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0066, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0037, code lost:
    
        if (r1 != X.C1XV.A0v) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r1 != X.C1XV.A0r) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r1 == X.C1XV.A0v) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C47K r22) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123545iT.A02(X.47K):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a2, code lost:
    
        if (r14 == X.C1XV.A0r) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x05ad, code lost:
    
        if (r8 != X.C47R.A06) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x05a9, code lost:
    
        if (r43.A06 != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (r15 != X.C1XV.A0v) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a4, code lost:
    
        r14 = r43.A09;
        X.AbstractC13880nE.A0U(r11, (int) X.AbstractC126235nK.A00(r14, 3));
        r5.setGravity(8388627);
        r5.A00 = true;
        r32 = r6.getSocialContextFacepileUsers();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ba, code lost:
    
        if (r32 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c2, code lost:
    
        if ((!r32.isEmpty()) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c4, code lost:
    
        r13 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01cf, code lost:
    
        if (X.C18U.A06(r13, r7, 36325411755406381L) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d1, code lost:
    
        r28 = java.lang.Integer.valueOf(r14.getColor(X.AbstractC53242c7.A0H(r14, com.facebook.R.attr.igds_color_elevated_background)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e0, code lost:
    
        r15 = r2.A05;
        r31 = r8.getModuleName();
        r16 = X.C18U.A06(r13, r7, 36323732423257658L);
        r0 = r14.getResources();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f8, code lost:
    
        if (r16 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fa, code lost:
    
        r33 = r0.getDimensionPixelSize(com.facebook.R.dimen.abc_dropdownitem_icon_width);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0201, code lost:
    
        r15.setImageDrawable(X.AbstractC89513yr.A04(r14, null, java.lang.Float.valueOf(0.6f), X.C05F.A01, null, null, null, r28, null, null, r31, r32, r33, X.C18U.A06(r13, r7, 36325428935275586L), true, false, true, false));
        r15.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02af, code lost:
    
        r33 = r0.getDimensionPixelSize(com.facebook.R.dimen.asset_picker_cell_margin);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02b5, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02b9, code lost:
    
        r1 = r2.A05;
        r1.setVisibility(8);
        r1.setImageDrawable(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0235, code lost:
    
        r5.A01 = true;
        r5.setBreakStrategy(2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.view.View] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123545iT.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int i2;
        int A03 = C0f9.A03(116098169);
        C47K c47k = this.A03;
        if (c47k != null) {
            List list = c47k.A0P;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            i2 = -309438366;
        } else {
            i = 0;
            i2 = -1952085330;
        }
        C0f9.A0A(i2, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C47R c47r;
        int i2;
        int i3;
        C47L A02;
        int A03 = C0f9.A03(-312481517);
        C47K c47k = this.A03;
        if (c47k != null && (A02 = c47k.A02(i)) != null) {
            c47r = A02.A07;
        } else {
            c47r = null;
        }
        if (c47r != null) {
            int ordinal = c47r.ordinal();
            int i4 = 1;
            if (ordinal != 6 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                i4 = 0;
                i2 = -231331650;
                if (ordinal == 0) {
                    i3 = 1080099793;
                }
            } else {
                i3 = 717046396;
            }
            C0f9.A0A(i3, A03);
            return i4;
        }
        i2 = -698870369;
        C0f9.A0A(i2, A03);
        return -1;
    }
}
