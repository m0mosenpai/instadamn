package X;

import com.instagram.autoplay.models.AutoplayCustomization;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Tzi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66107Tzi {
    public AutoplayCustomization A00;
    public AutoplayCustomization A01;
    public Long A02;
    public Long A03;
    public final C65863TvQ A04;
    public final C65865TvS A05;
    public final C13920nI A06;

    public C66107Tzi(C65863TvQ c65863TvQ, C65865TvS c65865TvS, C13920nI c13920nI) {
        C14360o3.A0B(c13920nI, 1);
        this.A06 = c13920nI;
        this.A04 = c65863TvQ;
        this.A05 = c65865TvS;
        A00();
    }

    public final void A00() {
        Object obj;
        C65865TvS c65865TvS = this.A05;
        String str = c65865TvS.A01;
        if (str == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = c65865TvS.A05;
            reentrantReadWriteLock.readLock().lock();
            str = null;
            try {
                try {
                    InterfaceC19630xq interfaceC19630xq = (InterfaceC19630xq) c65865TvS.A06.getValue();
                    if (interfaceC19630xq != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("last_customization_used_id_for_layout_");
                        String string = interfaceC19630xq.getString(AbstractC166997dE.A0v(c65865TvS.A03, sb), "");
                        if (string != null) {
                            if (string.length() != 0) {
                                reentrantReadWriteLock.readLock().unlock();
                                str = string;
                            }
                        }
                    }
                } catch (Exception e) {
                    C0K8.A0F("Autoplay", "SharedPreferences exception", e);
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
        C65863TvQ c65863TvQ = this.A04;
        List A00 = C65863TvQ.A00(c65863TvQ, c65863TvQ.A01());
        Iterator it = A00.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            } else {
                obj = it.next();
            }
        } while (!C14360o3.A0K(((AutoplayCustomization) obj).id, str));
        AutoplayCustomization autoplayCustomization = (AutoplayCustomization) obj;
        if (autoplayCustomization == null && (!A00.isEmpty())) {
            autoplayCustomization = (AutoplayCustomization) AbstractC001800i.A0K(A00);
        }
        A01(autoplayCustomization);
        A00.size();
    }

    public final void A01(AutoplayCustomization autoplayCustomization) {
        String str;
        this.A01 = this.A00;
        this.A03 = this.A02;
        this.A00 = autoplayCustomization;
        this.A02 = AbstractC31173DnH.A0g();
        C65865TvS c65865TvS = this.A05;
        if (autoplayCustomization != null) {
            str = autoplayCustomization.id;
        } else {
            str = null;
        }
        InterfaceC19630xq interfaceC19630xq = (InterfaceC19630xq) c65865TvS.A06.getValue();
        if (interfaceC19630xq != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = c65865TvS.A05;
            reentrantReadWriteLock.writeLock().lock();
            try {
                try {
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    StringBuilder sb = new StringBuilder();
                    sb.append("last_customization_used_id_for_layout_");
                    ARD.E7K(AbstractC166997dE.A0v(c65865TvS.A03, sb), str);
                    ARD.apply();
                    c65865TvS.A01 = str;
                } catch (Exception e) {
                    C0K8.A0F("Autoplay", "SharedPreferences exception", e);
                }
            } finally {
                AbstractC65702TsY.A1W(reentrantReadWriteLock);
            }
        }
    }
}
