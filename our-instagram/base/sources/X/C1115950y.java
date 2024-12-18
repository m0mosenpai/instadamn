package X;

import android.os.SystemClock;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* renamed from: X.50y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1115950y implements InterfaceC1116050z {
    public Timer A00;
    public final InterfaceC111304zt A01;
    public final java.util.Set A02;
    public final TimerTask A03;
    public final /* synthetic */ C111334zw A04;

    public C1115950y(InterfaceC111304zt interfaceC111304zt, final C111334zw c111334zw) {
        this.A04 = c111334zw;
        long millis = TimeUnit.MINUTES.toMillis(3L);
        this.A02 = Collections.synchronizedSet(new HashSet());
        this.A01 = interfaceC111304zt;
        TimerTask timerTask = new TimerTask() { // from class: X.510
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1115950y c1115950y = C1115950y.this;
                C111334zw c111334zw2 = c1115950y.A04;
                c111334zw2.A08.clear();
                c1115950y.A01.DHJ(C05F.A00, true);
                C1115750w c1115750w = c111334zw2.A00;
                if (c1115750w != null) {
                    Object obj = C1115750w.A01.get();
                    obj.getClass();
                    ((AbstractCollection) obj).remove(c1115750w);
                }
            }
        };
        this.A03 = timerTask;
        Timer timer = new Timer();
        this.A00 = timer;
        timer.schedule(timerTask, millis);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC1116050z
    public final void AVi(final String str) {
        AnonymousClass511 anonymousClass511;
        final long uptimeMillis = SystemClock.uptimeMillis();
        C11T.A02(new Runnable() { // from class: X.5Ey
            @Override // java.lang.Runnable
            public final void run() {
                Object obj = C1115750w.A01.get();
                obj.getClass();
                AbstractList abstractList = (AbstractList) obj;
                SystemClock.currentThreadTimeMillis();
                Object obj2 = new Object();
                int size = abstractList.size() - 1;
                if (size >= 0) {
                    ((C1115750w) abstractList.get(size)).A00.add(obj2);
                }
            }
        });
        java.util.Set set = this.A02;
        set.add(str);
        C111334zw c111334zw = this.A04;
        C111314zu c111314zu = c111334zw.A07;
        switch (str.hashCode()) {
            case -1973589566:
                if (str.equals("feed_parsing_test")) {
                    anonymousClass511 = AnonymousClass511.A05;
                    break;
                }
                anonymousClass511 = AnonymousClass511.A09;
                break;
            case -1065690145:
                if (str.equals("self_profile_background_prefetch")) {
                    anonymousClass511 = AnonymousClass511.A07;
                    break;
                }
                anonymousClass511 = AnonymousClass511.A09;
                break;
            case -124356989:
                if (str.equals("direct_xma_clips_background_prefetch")) {
                    anonymousClass511 = AnonymousClass511.A03;
                    break;
                }
                anonymousClass511 = AnonymousClass511.A09;
                break;
            case -115550250:
                if (str.equals("explore_popular_background_prefetch")) {
                    anonymousClass511 = AnonymousClass511.A04;
                    break;
                }
                anonymousClass511 = AnonymousClass511.A09;
                break;
            case 1025047531:
                if (str.equals("feed_timeline_background_prefetch")) {
                    anonymousClass511 = AnonymousClass511.A06;
                    break;
                }
                anonymousClass511 = AnonymousClass511.A09;
                break;
            case 1364928579:
                if (str.equals("reel_background_prefetch")) {
                    anonymousClass511 = AnonymousClass511.A08;
                    break;
                }
                anonymousClass511 = AnonymousClass511.A09;
                break;
            default:
                anonymousClass511 = AnonymousClass511.A09;
                break;
        }
        if (C111314zu.A01(c111314zu)) {
            synchronized (c111314zu) {
                c111314zu.A03.add(anonymousClass511);
            }
        }
        if (set.size() == c111334zw.A08.size()) {
            Timer timer = this.A00;
            if (timer != null) {
                timer.cancel();
            }
            this.A01.DHJ(C05F.A01, true);
            C1115750w c1115750w = c111334zw.A00;
            if (c1115750w != null) {
                Object obj = C1115750w.A01.get();
                obj.getClass();
                ((AbstractCollection) obj).remove(c1115750w);
            }
        }
    }
}
