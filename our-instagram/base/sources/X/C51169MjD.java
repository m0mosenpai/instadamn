package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MjD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51169MjD extends C2UU {
    public C56803PIu A00;
    public C56800PIr A01;
    public final Context A02;
    public final UserSession A03;
    public final EnumC142806cg A04;
    public final InterfaceC58172Pqc A05;
    public final List A06 = AbstractC166987dD.A1E();
    public final List A07 = AbstractC166987dD.A1E();
    public final C19L A08;
    public final InterfaceC11380iw A09;
    public final O64 A0A;

    public final void A02(InterfaceC58171Pqb interfaceC58171Pqb) {
        C14360o3.A0B(interfaceC58171Pqb, 0);
        List list = this.A06;
        if (!list.contains(interfaceC58171Pqb) && A04(interfaceC58171Pqb)) {
            int size = 500 - list.size();
            if (size < 1) {
                int min = Math.min(list.size(), 1 - size);
                Iterator it = list.iterator();
                Iterator it2 = this.A07.iterator();
                for (int i = 0; i < min; i++) {
                    it.next();
                    it.remove();
                    if (it2.hasNext()) {
                        it2.next();
                        it2.remove();
                    }
                }
                if (min == 1) {
                    notifyItemRemoved(getItemCount() + 1);
                }
            }
            list.add(interfaceC58171Pqb);
            this.A07.add(getItemCount(), interfaceC58171Pqb);
            notifyItemInserted(0);
        }
    }

    public final void A03(InterfaceC58171Pqb interfaceC58171Pqb) {
        C14360o3.A0B(interfaceC58171Pqb, 0);
        List list = this.A07;
        int indexOf = list.indexOf(interfaceC58171Pqb);
        if (indexOf != -1) {
            list.remove(indexOf);
            this.A06.remove(interfaceC58171Pqb);
            notifyItemRemoved(A00(this, indexOf) + 1);
        }
    }

    public final boolean A04(InterfaceC58171Pqb interfaceC58171Pqb) {
        String pk;
        C14360o3.A0B(interfaceC58171Pqb, 0);
        if (interfaceC58171Pqb.BO3() != EnumC53264Nh2.A0A) {
            return true;
        }
        C56803PIu c56803PIu = (C56803PIu) interfaceC58171Pqb;
        if (!AbstractC50102Ry.A00(c56803PIu, this.A00)) {
            O64 o64 = this.A0A;
            C14360o3.A0B(c56803PIu, 0);
            User user = c56803PIu.A08;
            if ((user == null || !user.A1t()) && c56803PIu.A07.A00() && !c56803PIu.A0E && ((pk = c56803PIu.getPk()) == null || !C171547kk.A03.A00(o64.A00).A00.getBoolean(pk, false))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        if (r3.A04 == X.EnumC142806cg.A03) goto L51;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.MmN, X.NZf] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3OO onCreateViewHolder(android.view.ViewGroup r4, int r5) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51169MjD.onCreateViewHolder(android.view.ViewGroup, int):X.3OO");
    }

    public final void A01() {
        List list = this.A07;
        list.clear();
        for (InterfaceC58171Pqb interfaceC58171Pqb : this.A06) {
            if (A04(interfaceC58171Pqb)) {
                list.add(interfaceC58171Pqb);
            }
        }
        notifyDataSetChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x01cb, code lost:
    
        if (r4 != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01d1, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01d2, code lost:
    
        if (r11 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01d4, code lost:
    
        r14 = X.AbstractC37301Gc2.A0C(2131965625);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01dd, code lost:
    
        if (r11 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01df, code lost:
    
        r18 = X.AbstractC37300Gc1.A01().append((java.lang.CharSequence) "👋");
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01e7, code lost:
    
        if (r7 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01e9, code lost:
    
        r12 = X.AbstractC55163OdR.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01ed, code lost:
    
        r17 = X.C148336m3.A04.A04("👋");
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01f3, code lost:
    
        if (r6 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01f5, code lost:
    
        r4 = r10.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01fa, code lost:
    
        if (r4 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01fc, code lost:
    
        r16 = r4.getUsername();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0200, code lost:
    
        r15 = new X.C69749Vuj(new java.lang.Object[]{r16}, 2131965624);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0209, code lost:
    
        r7 = X.W41.A00;
        r4 = (X.C66484UJk) r27;
        r5 = r10.A09;
        r6 = r10.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0212, code lost:
    
        if (r6 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0214, code lost:
    
        r8 = r6.Bhu();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0218, code lost:
    
        r11 = new X.W3J(r12, null, r14, r15, r8, r17, r18, null, null, null, null, r5, null);
        r10 = r26.A09;
        r8 = new X.PJ3(0, r27, r0, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x023a, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0235, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0236, code lost:
    
        if (r6 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0238, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x023c, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x023f, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x01cf, code lost:
    
        if (r4 != 3) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x063d  */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r11v8, types: [X.Vuj] */
    /* JADX WARN: Type inference failed for: r12v7, types: [X.Vuj] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.Vuj] */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.instagram.common.typedurl.ImageUrl] */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r27, int r28) {
        /*
            Method dump skipped, instructions count: 1649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51169MjD.onBindViewHolder(X.3OO, int):void");
    }

    public C51169MjD(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg, InterfaceC58172Pqc interfaceC58172Pqc, O64 o64, C19L c19l) {
        this.A02 = context;
        this.A05 = interfaceC58172Pqc;
        this.A0A = o64;
        this.A03 = userSession;
        this.A04 = enumC142806cg;
        this.A08 = c19l;
        this.A09 = interfaceC11380iw;
    }

    public static final int A00(C51169MjD c51169MjD, int i) {
        if (c51169MjD.getItemCount() == 0) {
            return 0;
        }
        return (c51169MjD.getItemCount() - i) - 1;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-653464609);
        int size = this.A07.size();
        C0f9.A0A(-1201739210, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(746728087);
        int i2 = ((InterfaceC58171Pqb) this.A07.get(A00(this, i))).BO3().A00;
        C0f9.A0A(65023319, A03);
        return i2;
    }
}
