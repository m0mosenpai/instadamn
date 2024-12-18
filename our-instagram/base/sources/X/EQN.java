package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQN extends C2US implements InterfaceC161877Mx {
    public final Context A00;
    public final C32468ERu A01;
    public final C33608EtK A02;
    public final C34957Fah A03;
    public final C34531FJr A04;
    public final C168737g7 A05;
    public final C32436EQo A06;
    public final C32437EQp A07;
    public final C32438EQq A08;
    public final C32440EQs A09;
    public final C31544DtU A0A;
    public final InterfaceC62602sz A0B;
    public final C65842yM A0C;
    public final C31566Dts A0D;
    public final C31566Dts A0E;
    public final C32464ERq A0F;
    public final ArrayList A0G;
    public final HashSet A0H;
    public final InterfaceC09390do A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final InterfaceC11380iw A0L;
    public final UserSession A0M;
    public final InterfaceC37214GaP A0N;
    public final GYQ A0O;
    public final GYR A0P;
    public final InterfaceC37204GaF A0Q;

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C14360o3.A0B(str, 0);
        return this.A0H.contains(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.EtK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.FJr, java.lang.Object] */
    public EQN(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37214GaP interfaceC37214GaP, GYQ gyq, GYR gyr, InterfaceC62602sz interfaceC62602sz, InterfaceC37204GaF interfaceC37204GaF, boolean z, boolean z2) {
        super(false);
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A00 = context;
        this.A0M = userSession;
        this.A0Q = interfaceC37204GaF;
        this.A0N = interfaceC37214GaP;
        this.A0O = gyq;
        this.A0P = gyr;
        this.A0B = interfaceC62602sz;
        this.A0L = interfaceC11380iw;
        this.A0J = z;
        this.A0K = z2;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A05 = c168737g7;
        C31566Dts c31566Dts = new C31566Dts(context, null);
        this.A0D = c31566Dts;
        this.A0I = AbstractC09440dt.A01(new C37052GUi(this, 42));
        C31566Dts c31566Dts2 = new C31566Dts(context, gyq, gyr);
        this.A0E = c31566Dts2;
        C32464ERq c32464ERq = new C32464ERq(interfaceC11380iw, interfaceC37204GaF, A1V, false);
        this.A0F = c32464ERq;
        C32437EQp c32437EQp = new C32437EQp(context);
        this.A07 = c32437EQp;
        C32438EQq c32438EQq = new C32438EQq(context);
        this.A08 = c32438EQq;
        C32468ERu c32468ERu = new C32468ERu(context, interfaceC11380iw, userSession, interfaceC37214GaP);
        this.A01 = c32468ERu;
        C32440EQs c32440EQs = new C32440EQs(context);
        this.A09 = c32440EQs;
        C32436EQo c32436EQo = new C32436EQo(context);
        this.A06 = c32436EQo;
        C31544DtU c31544DtU = new C31544DtU(context);
        this.A0A = c31544DtU;
        C65842yM c65842yM = new C65842yM(context);
        this.A0C = c65842yM;
        ?? obj = new Object();
        obj.A00 = false;
        obj.A02 = false;
        obj.A01 = false;
        this.A02 = obj;
        this.A03 = new C34957Fah(false, false, false, false, false);
        ?? obj2 = new Object();
        this.A04 = obj2;
        this.A0G = AbstractC166987dD.A1E();
        this.A0H = AbstractC166987dD.A1H();
        init(c32436EQo, c168737g7, c31566Dts, (InterfaceC65642y0) this.A0I.getValue(), c31566Dts2, c32464ERq, c32437EQp, c32438EQq, c32468ERu, c32440EQs, c31544DtU, c65842yM);
        obj2.A00 = A1V;
    }

    public final void A00(List list) {
        InterfaceC65642y0 interfaceC65642y0;
        Object obj;
        InterfaceC65642y0 interfaceC65642y02;
        ArrayList arrayList = this.A0G;
        arrayList.clear();
        arrayList.addAll(list);
        clear();
        HashSet hashSet = this.A0H;
        hashSet.clear();
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            Object A0l = AbstractC166997dE.A0l(A13);
            if (A0l instanceof C54737OFo) {
                interfaceC65642y0 = this.A06;
            } else if (A0l instanceof C31335Dq0) {
                if (((C31335Dq0) A0l).A0G != null) {
                    interfaceC65642y0 = this.A0D;
                } else {
                    obj = this.A04;
                    interfaceC65642y02 = this.A05;
                    addModel(A0l, obj, interfaceC65642y02);
                }
            } else if (C211739Zk.A00(A0l, 4)) {
                interfaceC65642y0 = (AbstractC65632xz) this.A0I.getValue();
            } else if (A0l instanceof FNI) {
                interfaceC65642y0 = this.A0F;
            } else {
                if (A0l instanceof FMT) {
                    obj = this.A02;
                    interfaceC65642y02 = this.A07;
                } else if (A0l instanceof C32107E9f) {
                    if (this.A0J) {
                        this.A01.A00 = true;
                    }
                    C32468ERu c32468ERu = this.A01;
                    c32468ERu.A01 = this.A0K;
                    addModel(A0l, C0eB.A00, c32468ERu);
                    AbstractC31173DnH.A1X(((C32107E9f) A0l).A00, hashSet);
                } else if (A0l instanceof C34969Fat) {
                    obj = this.A03;
                    interfaceC65642y02 = this.A08;
                } else if (A0l instanceof C36731GHa) {
                    interfaceC65642y0 = this.A09;
                } else if (A0l instanceof C35246Fgf) {
                    interfaceC65642y0 = this.A0A;
                } else if (A0l instanceof FGX) {
                    A0l = ((FGX) A0l).A00;
                    interfaceC65642y0 = this.A0E;
                }
                addModel(A0l, obj, interfaceC65642y02);
            }
            addModel(A0l, interfaceC65642y0);
        }
        addModel(this.A0B, this.A0C);
        notifyDataSetChanged();
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        notifyDataSetChanged();
    }
}
