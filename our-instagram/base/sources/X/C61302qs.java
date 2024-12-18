package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61302qs implements InterfaceC61312qt {
    public final UserSession A00;
    public final Object A01 = new Object();
    public final java.util.Set A02 = new HashSet();
    public final java.util.Set A03 = new HashSet();

    @Override // X.InterfaceC61312qt
    public final void DeD(Integer num, int i, long j, boolean z) {
        C14360o3.A0B(num, 3);
        synchronized (this.A01) {
            Iterator it = A00().iterator();
            while (it.hasNext()) {
                ((InterfaceC61312qt) it.next()).DeD(num, i, j, z);
            }
        }
    }

    @Override // X.InterfaceC61312qt
    public final void DeE(C1OP c1op, String str, int i, long j, boolean z, boolean z2) {
        C14360o3.A0B(c1op, 0);
        C14360o3.A0B(str, 1);
        synchronized (this.A01) {
            Iterator it = A00().iterator();
            while (it.hasNext()) {
                ((InterfaceC61312qt) it.next()).DeE(c1op, str, i, j, z, z2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private final Collection A00() {
        ?? r2;
        if (C18U.A06(C06090Tz.A05, this.A00, 36325695224296738L)) {
            java.util.Set set = this.A03;
            AnonymousClass016.A17(set, C84583q7.A00);
            r2 = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Object obj = ((Reference) it.next()).get();
                if (obj != null) {
                    r2.add(obj);
                }
            }
        } else {
            r2 = this.A02;
        }
        return (Collection) r2;
    }

    @Override // X.InterfaceC61312qt
    public final void DKn(boolean z) {
        synchronized (this.A01) {
            Iterator it = A00().iterator();
            while (it.hasNext()) {
                ((InterfaceC61312qt) it.next()).DKn(z);
            }
        }
    }

    @Override // X.InterfaceC61322qu
    public final void DXf(long j, int i) {
        synchronized (this.A01) {
            Iterator it = A00().iterator();
            while (it.hasNext()) {
                ((InterfaceC61312qt) it.next()).DXf(j, i);
            }
        }
    }

    @Override // X.InterfaceC61322qu
    public final void DXg(long j) {
        synchronized (this.A01) {
            Iterator it = A00().iterator();
            while (it.hasNext()) {
                ((InterfaceC61312qt) it.next()).DXg(j);
            }
        }
    }

    @Override // X.InterfaceC61312qt
    public final void De4(boolean z, boolean z2) {
        synchronized (this.A01) {
            Iterator it = A00().iterator();
            while (it.hasNext()) {
                ((InterfaceC61312qt) it.next()).De4(z, z2);
            }
        }
    }

    @Override // X.InterfaceC61312qt
    public final void DeG() {
        synchronized (this.A01) {
            Iterator it = A00().iterator();
            while (it.hasNext()) {
                ((InterfaceC61312qt) it.next()).DeG();
            }
        }
    }

    public C61302qs(UserSession userSession) {
        this.A00 = userSession;
    }
}
