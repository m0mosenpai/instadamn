package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wem, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70666Wem implements XLM, XAG, XAH {
    public final C68729Vb8 A00;
    public final C69219Vjm A01;
    public final String A02;
    public final List A03;
    public final Bundle A04 = new Bundle();
    public final VEO A05 = VEO.A0D;
    public final String A06;
    public final List A07;

    public C70666Wem(C68962Vf0 c68962Vf0, C68729Vb8 c68729Vb8, C69219Vjm c69219Vjm, String str, String str2, List list) {
        List list2;
        this.A06 = str;
        this.A01 = c69219Vjm;
        this.A03 = list;
        this.A00 = c68729Vb8;
        this.A02 = str2;
        if (c68962Vf0 != null) {
            list2 = Collections.unmodifiableList(c68962Vf0.A00);
            C14360o3.A07(list2);
        } else {
            list2 = C16930sl.A00;
        }
        this.A07 = list2;
    }

    public final V2M A00(int i) {
        Object obj;
        Object obj2;
        List AYm;
        List list = this.A07;
        if (list.isEmpty()) {
            return null;
        }
        Object obj3 = list.get(i);
        C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.canvas.framework.model.data.HasLinkAction");
        List AYm2 = ((XAG) obj3).AYm();
        if (AYm2 != null && !AYm2.isEmpty()) {
            obj2 = list.get(i);
            C14360o3.A0C(obj2, AbstractC111324zv.A00(482));
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    XLM xlm = (XLM) obj;
                    if ((xlm instanceof V2M) && (AYm = ((XAG) xlm).AYm()) != null && !AYm.isEmpty()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            obj2 = (XLM) obj;
            if (obj2 == null) {
                return null;
            }
        }
        return (V2M) obj2;
    }

    @Override // X.XAG
    public final List AYm() {
        return this.A03;
    }

    @Override // X.MOD
    public final int BAP() {
        return 100;
    }

    @Override // X.XAH
    public final C68729Vb8 BOy() {
        return this.A00;
    }

    @Override // X.XLM
    public final C69219Vjm C37() {
        return this.A01;
    }

    @Override // X.XLM
    public final VEO CBa() {
        return this.A05;
    }

    @Override // X.XLM
    public final String getId() {
        return this.A06;
    }
}
