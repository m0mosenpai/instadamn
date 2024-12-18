package X;

import android.app.Dialog;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.Iterator;

/* renamed from: X.V7y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68046V7y extends AbstractC154286wd {
    public final int A00;
    public final EnumC68206VFy A01;
    public final boolean A02;
    public final boolean A03;
    public final /* synthetic */ V1R A04;

    public C68046V7y(EnumC68206VFy enumC68206VFy, V1R v1r, int i, boolean z, boolean z2) {
        this.A04 = v1r;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = enumC68206VFy;
        this.A00 = i;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Dialog dialog;
        android.net.Uri uri;
        int A03 = C0f9.A03(1764358452);
        C67848UzT c67848UzT = (C67848UzT) obj;
        int A032 = C0f9.A03(1383191025);
        C14360o3.A0B(c67848UzT, 0);
        V1R v1r = this.A04;
        C69445VnU A01 = AbstractC69956VyW.A01(V1R.A00(v1r), c67848UzT);
        EnumC68206VFy enumC68206VFy = this.A01;
        boolean z = this.A03;
        boolean z2 = this.A02;
        C69350Vlw c69350Vlw = A01.A02;
        C145036gO c145036gO = v1r.A0a;
        V1R.A00(v1r);
        if (c145036gO.A02 || (((dialog = c145036gO.A00) != null && dialog.isShowing()) || c69350Vlw == null)) {
            V1R.A02(enumC68206VFy, A01, v1r, z, z2);
        } else {
            UserSession A00 = V1R.A00(v1r);
            FragmentActivity requireActivity = v1r.requireActivity();
            Hashtag hashtag = V1R.A01(v1r).A01;
            C68034V7f c68034V7f = v1r.A08;
            if (c68034V7f != null) {
                long A05 = c68034V7f.A05();
                C68034V7f c68034V7f2 = v1r.A08;
                if (c68034V7f2 != null) {
                    String obj2 = c68034V7f2.A00.toString();
                    C70882Wjb c70882Wjb = new C70882Wjb(enumC68206VFy, A01, v1r, z, z2);
                    String str = c69350Vlw.A04;
                    C69294Vl2 c69294Vl2 = null;
                    if (!TextUtils.isEmpty(str)) {
                        uri = AbstractC08820cl.A03(str);
                    } else {
                        uri = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = c69350Vlw.A05.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(" ");
                    }
                    String str2 = c69350Vlw.A02;
                    Boolean bool = c145036gO.A01;
                    if (bool == null) {
                        bool = false;
                        c145036gO.A01 = bool;
                    }
                    if (bool.booleanValue()) {
                        c69294Vl2 = new C69294Vl2(v1r, A00, hashtag, c69350Vlw.A00, obj2, A05);
                    }
                    C145036gO.A00(requireActivity, uri, v1r, A00, c70882Wjb, c145036gO, c69294Vl2, v1r, c69350Vlw.A03, sb.toString(), c69350Vlw.A01, str2, c69350Vlw.A00, hashtag.getName());
                }
            }
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        C0f9.A0A(-12702448, A032);
        C0f9.A0A(161991418, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-668431276);
        C66095TzW c66095TzW = this.A04.A06;
        if (c66095TzW == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        C66095TzW.A00(c66095TzW);
        C0f9.A0A(-1187823911, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1092909598);
        V1R v1r = this.A04;
        v1r.A0Y.post(new RunnableC71509WvE(this, v1r));
        C0f9.A0A(1592525146, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        long j;
        String str;
        Long A0k;
        int A03 = C0f9.A03(890192838);
        if (this.A03) {
            V1R v1r = this.A04;
            String id = V1R.A01(v1r).A01.getId();
            UserSession A00 = V1R.A00(v1r);
            if (id != null && (A0k = AbstractC003100w.A0k(10, id)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            EnumC39652Hih enumC39652Hih = v1r.A00;
            C153756vk c153756vk = v1r.A03;
            if (c153756vk == null) {
                str = "pivotPageSessionProvider";
            } else {
                C14360o3.A0B(A00, 0);
                C18920wW A01 = AbstractC12220kQ.A01(v1r, A00);
                InterfaceC02590Ai A002 = A01.A00(A01.A00, "instagram_organic_hashtag_page_impression");
                if (A002.isSampled()) {
                    A002.AAP("containermodule", v1r.A0f);
                    A002.A9K("container_id", Long.valueOf(j));
                    A002.A8R(enumC39652Hih, AbstractC43591JPw.A00(32));
                    AbstractC37302Gc3.A0t(A002);
                    A002.A9K(MSV.A00(220), AbstractC167007dF.A0d());
                    A002.A9K("hashtag_id", AbstractC25233BEq.A0n(id));
                    A002.A8R(c153756vk.A02, AbstractC43591JPw.A00(446));
                    A002.AAP(AbstractC111324zv.A00(71), c153756vk.getSessionId());
                    A002.Cht();
                }
                C65823Tug c65823Tug = v1r.A07;
                if (c65823Tug == null) {
                    str = "grid";
                } else {
                    C65823Tug.A00(c65823Tug, false, true);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A0A(-1242141832, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1887771531);
        V1R v1r = this.A04;
        WG5.A04(v1r.A0c, AbstractC111324zv.A00(1620), this.A00);
        if (this.A03) {
            C154846xZ c154846xZ = v1r.A02;
            if (c154846xZ != null) {
                ((MTJ) c154846xZ).A00.A04();
                C154846xZ c154846xZ2 = v1r.A02;
                if (c154846xZ2 != null) {
                    c154846xZ2.D4p();
                }
            }
            C14360o3.A0F("gridPerfLogger");
            throw C00O.createAndThrow();
        }
        C0f9.A0A(518642677, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(410536862);
        C67848UzT c67848UzT = (C67848UzT) obj;
        int A0N = AbstractC167017dG.A0N(c67848UzT, -335178715);
        V1R v1r = this.A04;
        C69445VnU A01 = AbstractC69956VyW.A01(V1R.A00(v1r), c67848UzT);
        EnumC68206VFy enumC68206VFy = this.A01;
        boolean z = this.A02;
        boolean z2 = this.A03;
        if (z && z2) {
            enumC68206VFy = A01.A01;
            C14360o3.A0A(enumC68206VFy);
        }
        v1r.A0Y.post(new Wx4(enumC68206VFy, A01, this, v1r));
        C0f9.A0A(624931249, A0N);
        C0f9.A0A(740011634, A03);
    }
}
