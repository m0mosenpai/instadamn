package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J7J extends C03E implements InterfaceC16590sC {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public J7J(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L16;
                case 2: goto L1e;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.1GJ> r3 = X.C1GJ.class
            r1 = 5
            java.lang.String r4 = "scheduleOnThreadPool"
            java.lang.String r5 = "scheduleOnThreadPool(Lcom/instagram/common/task/ObservableTask;IIZZ)V"
        Ld:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.V0j> r3 = X.AbstractC67878V0j.class
            goto L18
        L16:
            java.lang.Class<X.HCh> r3 = X.C38934HCh.class
        L18:
            r1 = 5
            java.lang.String r4 = "handleTriMediaKeywordMediaClick"
            java.lang.String r5 = "handleTriMediaKeywordMediaClick(Lcom/instagram/discovery/recyclerview/model/TriMediaKeywordGridItemViewModel;Lcom/instagram/feed/media/Media;Lcom/instagram/common/recyclerview/grid/model/GridPosition;ILandroid/view/View;)V"
            goto Ld
        L1e:
            java.lang.Class<X.HCh> r3 = X.C38934HCh.class
            r1 = 5
            java.lang.String r4 = "handleTriMediaKeywordMediaTouch"
            java.lang.String r5 = "handleTriMediaKeywordMediaTouch(Lcom/instagram/feed/media/Media;Lcom/instagram/common/recyclerview/grid/model/GridPosition;ILandroid/view/View;Landroid/view/MotionEvent;)Z"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J7J.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ArrayList arrayList;
        switch (this.A00) {
            case 0:
                HKX hkx = (HKX) obj;
                C38321qM c38321qM = (C38321qM) obj2;
                C5qT c5qT = (C5qT) obj3;
                ((Number) obj4).intValue();
                AbstractC167027dH.A12(hkx, c38321qM, c5qT);
                C14360o3.A0B(obj5, 4);
                AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.receiver;
                abstractC67878V0j.A0A(c5qT, hkx, c38321qM);
                FragmentActivity requireActivity = abstractC67878V0j.requireActivity();
                UserSession session = abstractC67878V0j.getSession();
                C132835z6 c132835z6 = hkx.A02;
                Keyword A00 = c132835z6.A00();
                String moduleName = abstractC67878V0j.getModuleName();
                String A0j = AbstractC167017dG.A0j();
                List list = c132835z6.A05;
                if (list != null) {
                    arrayList = AbstractC166987dD.A1E();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A0g = AbstractC37302Gc3.A0g(it);
                        if (A0g != null) {
                            arrayList.add(A0g);
                        }
                    }
                } else {
                    arrayList = null;
                }
                UserSession session2 = abstractC67878V0j.getSession();
                IS3.A01(requireActivity, session, null, abstractC67878V0j, c38321qM, A00, A0j, moduleName, "", null, arrayList, C18U.A06(AbstractC166997dE.A0U(session2), session2, 36317534786164060L));
                return C0eB.A00;
            case 1:
                HKX hkx2 = (HKX) obj;
                C38321qM c38321qM2 = (C38321qM) obj2;
                C5qT c5qT2 = (C5qT) obj3;
                ((Number) obj4).intValue();
                AbstractC167027dH.A12(hkx2, c38321qM2, c5qT2);
                C14360o3.A0B(obj5, 4);
                C38934HCh c38934HCh = (C38934HCh) this.receiver;
                C11520jB E6Q = c38934HCh.E6Q(c38321qM2);
                C132835z6 c132835z62 = hkx2.A02;
                IS4.A00(E6Q, c132835z62);
                C38934HCh.A01(c5qT2, hkx2, c38321qM2, c38934HCh);
                C38934HCh.A03(c38321qM2, c132835z62.A00(), c38934HCh, c132835z62.A05);
                return C0eB.A00;
            case 2:
                C38321qM c38321qM3 = (C38321qM) obj;
                C5qT c5qT3 = (C5qT) obj2;
                int A0H = AbstractC166987dD.A0H(obj3);
                View view = (View) obj4;
                MotionEvent motionEvent = (MotionEvent) obj5;
                C14360o3.A0B(c38321qM3, 0);
                AbstractC25233BEq.A0w(1, c5qT3, view, motionEvent);
                AnonymousClass308 anonymousClass308 = ((C38934HCh) this.receiver).A07;
                if (anonymousClass308 == null) {
                    C14360o3.A0F("peekMediaController");
                    throw C00O.createAndThrow();
                }
                return Boolean.valueOf(anonymousClass308.DuC(motionEvent, view, c38321qM3, (c5qT3.A01 * 3) + A0H));
            default:
                C11R c11r = (C11R) obj;
                C1GJ.A06(c11r, AbstractC166987dD.A0H(obj2), AbstractC166987dD.A0H(obj3), AbstractC166987dD.A1a(obj4), AbstractC25231BEo.A1W(obj5, c11r));
                return C0eB.A00;
        }
    }
}
