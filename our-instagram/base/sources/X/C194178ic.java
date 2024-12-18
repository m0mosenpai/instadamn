package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.8ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194178ic implements InterfaceC66442zL {
    public static final Executor A05 = new Executor() { // from class: X.8id
        public final Handler A00 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C14360o3.A0B(runnable, 0);
            this.A00.post(runnable);
        }
    };
    public InterfaceC65452xh A00;
    public List A01;
    public final Executor A02;
    public final AtomicLong A03;
    public final InterfaceC14020nS A04;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2xh, java.lang.Object] */
    public C194178ic(InterfaceC14020nS interfaceC14020nS, Executor executor) {
        C14360o3.A0B(executor, 1);
        this.A02 = executor;
        this.A04 = interfaceC14020nS;
        this.A00 = new Object();
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        this.A01 = emptyList;
        this.A03 = new AtomicLong();
    }

    @Override // X.InterfaceC66442zL
    public final void EYF(InterfaceC65452xh interfaceC65452xh) {
        C14360o3.A0B(interfaceC65452xh, 0);
        this.A00 = interfaceC65452xh;
    }

    @Override // X.InterfaceC66442zL
    public final void EpB(final ViewModelListUpdate viewModelListUpdate, final InterfaceC66382zF interfaceC66382zF) {
        C14360o3.A0B(viewModelListUpdate, 0);
        C14360o3.A0B(interfaceC66382zF, 1);
        final long incrementAndGet = this.A03.incrementAndGet();
        final List list = this.A01;
        this.A04.ATO(new AbstractRunnableC14200nk(this) { // from class: X.8j6
            public final /* synthetic */ C194178ic A01;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(55, 2, false, true);
                this.A01 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final List A0a = AbstractC001800i.A0a(viewModelListUpdate.A00);
                final C194178ic c194178ic = this.A01;
                long j = c194178ic.A03.get();
                final long j2 = incrementAndGet;
                if (j == j2) {
                    final C66582za A00 = AbstractC66552zX.A00(new C66532zV(list, A0a));
                    Executor executor = c194178ic.A02;
                    final InterfaceC66382zF interfaceC66382zF2 = interfaceC66382zF;
                    executor.execute(new Runnable() { // from class: X.8j7
                        @Override // java.lang.Runnable
                        public final void run() {
                            C194178ic c194178ic2 = c194178ic;
                            if (c194178ic2.A03.get() == j2) {
                                List list2 = A0a;
                                C66582za c66582za = A00;
                                c194178ic2.A01 = Collections.unmodifiableList(list2);
                                c66582za.A02(c194178ic2.A00);
                                interfaceC66382zF2.DxB();
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // X.InterfaceC66442zL
    public final List AuX() {
        return this.A01;
    }
}
