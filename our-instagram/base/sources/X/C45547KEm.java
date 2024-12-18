package X;

import android.util.LruCache;
import android.view.ViewGroup;
import com.instagram.arlink.fragment.NametagController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KEm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45547KEm extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C45547KEm(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(363519139);
            ((C44549Jmt) this.A01).A06.Egh(C219499mx.A00);
            i = 1479942735;
        } else {
            A03 = C0f9.A03(-841005384);
            NametagController.A01((ViewGroup) this.A02, (NametagController) this.A01);
            i = 933154302;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        if (1 - this.A00 != 0) {
            super.onStart();
            return;
        }
        int A03 = C0f9.A03(-741989364);
        ((C44549Jmt) this.A01).A02();
        C0f9.A0A(-1663980030, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        List<AA7> list;
        String str;
        A91 a91;
        if (this.A00 != 0) {
            A03 = C0f9.A03(1522578905);
            K8C k8c = (K8C) obj;
            int A0N = AbstractC167017dG.A0N(k8c, 786035520);
            C47543KzB c47543KzB = (C47543KzB) this.A02;
            ArrayList A1E = AbstractC166987dD.A1E();
            C47296Kv7 c47296Kv7 = k8c.A00;
            if (c47296Kv7 == null || (list = c47296Kv7.A00) == null) {
                list = C16930sl.A00;
            }
            for (AA7 aa7 : list) {
                A7Q a7q = aa7.A02;
                Integer num = null;
                if (a7q != null) {
                    str = a7q.A00;
                } else {
                    str = null;
                }
                String str2 = aa7.A06;
                A8P a8p = aa7.A01;
                if (a8p != null) {
                    a91 = a8p.A00;
                    Float f = a8p.A01;
                    if (f != null) {
                        num = Integer.valueOf((int) (f.floatValue() * 1000.0f));
                    }
                } else {
                    a91 = null;
                }
                if (str != null && str2 != null && a91 != null && num != null) {
                    String str3 = aa7.A05;
                    C14360o3.A07(str3);
                    int intValue = num.intValue();
                    C47712L4t c47712L4t = aa7.A00.A00;
                    C14360o3.A07(c47712L4t);
                    C47712L4t c47712L4t2 = aa7.A00.A01;
                    C14360o3.A07(c47712L4t2);
                    A1E.add(new C45056Jwl(c47712L4t, c47712L4t2, a91, C05F.A00, str3, str, str2, intValue));
                }
            }
            LruCache lruCache = c47543KzB.A00;
            String str4 = this.A03;
            lruCache.put(str4, A1E);
            ((C44549Jmt) this.A01).A05(str4, A1E);
            C0f9.A0A(-2054383070, A0N);
            i = -1631856810;
        } else {
            A03 = C0f9.A03(1997230085);
            int A032 = C0f9.A03(1800170704);
            NametagController nametagController = (NametagController) this.A01;
            nametagController.A02 = ((EC1) obj).A00;
            nametagController.mCardView.setUrl(NametagController.A00(nametagController, this.A03));
            NametagController.A01((ViewGroup) this.A02, nametagController);
            C0f9.A0A(1542932816, A032);
            i = 1406058295;
        }
        C0f9.A0A(i, A03);
    }
}
