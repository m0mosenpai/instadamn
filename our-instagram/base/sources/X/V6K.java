package X;

import com.instagram.banyan.BanyanCoordinator;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public final class V6K extends AbstractRunnableC14200nk {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ C3MC A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6K(BanyanCoordinator banyanCoordinator, C3MC c3mc) {
        super(19, 3, true, true);
        this.A01 = c3mc;
        this.A00 = banyanCoordinator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3MC c3mc = this.A01;
        if (c3mc.A00 == FollowStatus.A06) {
            BanyanCoordinator banyanCoordinator = this.A00;
            String str = c3mc.A01;
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = banyanCoordinator.A09.A00;
                if (AbstractC65702TsY.A1b(reentrantReadWriteLock)) {
                    try {
                        C5e8 c5e8 = banyanCoordinator.A07;
                        C121125e6 c121125e6 = c5e8.A02;
                        c121125e6.A00();
                        Map map = c5e8.A07;
                        C121395ef c121395ef = (C121395ef) map.get("direct_inbox_active_now");
                        if (c121395ef != null) {
                            C15500q5.A04(c121395ef.A04).remove(str);
                        }
                        c121125e6.A00();
                        C121395ef c121395ef2 = (C121395ef) map.get("direct_inbox_active_now");
                        if (c121395ef2 != null) {
                            Iterator A14 = AbstractC166997dE.A14(c121395ef2.A04);
                            while (A14.hasNext()) {
                                Object A0m = MSZ.A0m(A14);
                                Map map2 = c5e8.A08;
                                if (map2.get(A0m) != null) {
                                    Object obj = map2.get(A0m);
                                    C14360o3.A0A(obj);
                                    Iterator A0i = AbstractC31177DnL.A0i(((C121375ed) obj).A0B);
                                    while (true) {
                                        if (!A0i.hasNext()) {
                                            break;
                                        } else if (C14360o3.A0K(((User) A0i.next()).getId(), str)) {
                                            A14.remove();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        c121125e6.A00();
                        C5e8.A00(c5e8, null);
                        AbstractC65702TsY.A1W(reentrantReadWriteLock);
                    } catch (Throwable th) {
                        AbstractC65702TsY.A1W(reentrantReadWriteLock);
                        throw th;
                    }
                }
            } catch (InterruptedException e) {
                C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            }
        }
    }
}
