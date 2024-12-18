package X;

import android.app.Application;
import android.content.Context;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

/* renamed from: X.8Js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185278Js extends C193578hc {
    public static final Map A0H = new LinkedHashMap();
    public int A00;
    public int A01;
    public long A02;
    public WG8 A03;
    public WG8 A04;
    public ListenableFuture A05;
    public ListenableFuture A06;
    public MusicAssetModel A07;
    public File A08;
    public File A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final InterfaceExecutorServiceC73393Qq A0E;
    public final UserSession A0F;
    public final C05A A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185278Js(Application application, UserSession userSession) {
        super(application);
        C14360o3.A0B(userSession, 2);
        this.A0F = userSession;
        InterfaceExecutorServiceC73393Qq listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        C14360o3.A07(listeningDecorator);
        this.A0E = listeningDecorator;
        this.A0D = true;
        this.A02 = 10000L;
        EnumC185288Jt[] values = EnumC185288Jt.values();
        ArrayList<EnumC185288Jt> arrayList = new ArrayList();
        for (EnumC185288Jt enumC185288Jt : values) {
            if (enumC185288Jt.A06 != C05F.A01 || AbstractC185298Jv.A03(this.A0F)) {
                arrayList.add(enumC185288Jt);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (EnumC185288Jt enumC185288Jt2 : arrayList) {
            Integer num = C05F.A00;
            Application application2 = super.A00;
            C14360o3.A0C(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
            String string = application2.getString(enumC185288Jt2.A03);
            boolean z = false;
            if (enumC185288Jt2.A04 == AudioFilterType.A0A) {
                z = true;
            }
            arrayList2.add(new C185308Jw(enumC185288Jt2, num, string, 0, z));
        }
        this.A0G = new C008002u(arrayList2);
    }

    public static final void A01(C185278Js c185278Js, EnumC185288Jt enumC185288Jt) {
        int i = 0;
        if (enumC185288Jt != null) {
            Iterator it = ((List) c185278Js.A0G.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C185308Jw) it.next()).A01 == enumC185288Jt) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        }
        c185278Js.A00(i, C05F.A00);
    }

    public final void A0G(Context context, InterfaceC190038bM interfaceC190038bM, InterfaceC190038bM interfaceC190038bM2, EnumC185288Jt enumC185288Jt, InterfaceC16600sD interfaceC16600sD) {
        int i;
        if (enumC185288Jt != null) {
            Iterator it = ((List) this.A0G.getValue()).iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((C185308Jw) it.next()).A01 == enumC185288Jt) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        } else {
            i = 0;
        }
        A0H(context, interfaceC190038bM, interfaceC190038bM2, interfaceC16600sD, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r1 == com.instagram.api.schemas.AudioFilterType.A0A) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H(android.content.Context r22, X.InterfaceC190038bM r23, X.InterfaceC190038bM r24, X.InterfaceC16600sD r25, int r26) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185278Js.A0H(android.content.Context, X.8bM, X.8bM, X.0sD, int):void");
    }

    private final void A00(int i, Integer num) {
        C05A c05a = this.A0G;
        ArrayList A0U = AbstractC001800i.A0U((Collection) c05a.getValue());
        Object A0O = AbstractC001800i.A0O(A0U, i);
        if (A0O != null) {
            C185308Jw A0E = A0E();
            if (A0E != null && !A0E.equals(A0O)) {
                A0U.set(this.A00, new C185308Jw(A0E.A01, C05F.A00, A0E.A03, A0E.A00, false));
            }
            this.A00 = i;
            C185308Jw c185308Jw = (C185308Jw) A0U.get(i);
            A0U.set(i, new C185308Jw(c185308Jw.A01, num, c185308Jw.A03, c185308Jw.A00, true));
            c05a.Egh(A0U);
        }
    }

    public final C185308Jw A0E() {
        return (C185308Jw) AbstractC001800i.A0O((List) this.A0G.getValue(), this.A00);
    }

    public final void A0F(int i, Integer num) {
        C05A c05a = this.A0G;
        ArrayList A0U = AbstractC001800i.A0U((Collection) c05a.getValue());
        C185308Jw c185308Jw = (C185308Jw) A0U.get(i);
        A0U.set(i, new C185308Jw(c185308Jw.A01, num, c185308Jw.A03, c185308Jw.A00, c185308Jw.A04));
        c05a.Egh(A0U);
    }

    public final void A0I(String str) {
        ListenableFuture listenableFuture;
        ListenableFuture listenableFuture2 = this.A05;
        if ((listenableFuture2 != null && !listenableFuture2.isDone()) || ((listenableFuture = this.A06) != null && !listenableFuture.isDone())) {
            C24U c24u = AnonymousClass229.A01(this.A0F).A03;
            c24u.A01 = c24u.A0E.A06(CancelReason.SYSTEM_CANCELLED, str, 17634511, c24u.A01);
        }
        ListenableFuture listenableFuture3 = this.A06;
        if (listenableFuture3 != null) {
            listenableFuture3.cancel(true);
        }
        ListenableFuture listenableFuture4 = this.A05;
        if (listenableFuture4 != null) {
            listenableFuture4.cancel(true);
        }
        WG8 wg8 = this.A04;
        if (wg8 != null) {
            wg8.A05();
        }
        WG8 wg82 = this.A03;
        if (wg82 != null) {
            wg82.A05();
        }
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
    }
}
