package X;

import android.content.Context;
import android.os.Process;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

/* renamed from: X.1uW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40631uW implements InterfaceC13030lp {
    public final Context A00;
    public final UserSession A01;

    public C40631uW(UserSession userSession, Context context) {
        C14360o3.A0B(context, 2);
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.InterfaceC13030lp
    public final void DyC(boolean z) {
        C18720vz c18720vz = AbstractC12960li.A00;
        C226418s A01 = C226218q.A01(c18720vz);
        A01.A0P(A01.A02, "SESSION_SCOPED_PROVIDER_INIT_START");
        int[] iArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94};
        int i = 0;
        do {
            int i2 = iArr[i];
            final C40561uP c40561uP = AnonymousClass145.A03;
            if (c40561uP == null) {
                C14360o3.A0F("asyncJobManager");
                throw C00O.createAndThrow();
            }
            final C40641uX c40641uX = new C40641uX(this, i2, z);
            if (!c40561uP.A04) {
                C14160ng c14160ng = new C14160ng(new Callable() { // from class: X.1uY
                    @Override // java.util.concurrent.Callable
                    public final /* bridge */ /* synthetic */ Object call() {
                        int threadPriority;
                        int intValue;
                        Integer num = C40561uP.this.A00;
                        InterfaceC16820sZ interfaceC16820sZ = c40641uX;
                        if (num != null && (intValue = num.intValue()) < (threadPriority = Process.getThreadPriority(Process.myTid()))) {
                            if (Systrace.A0E(1L)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("ScopedBoost priority=");
                                sb.append(num);
                                C0fO.A01(sb.toString(), 784970626);
                            }
                            Process.setThreadPriority(intValue);
                            try {
                                interfaceC16820sZ.invoke();
                                Process.setThreadPriority(threadPriority);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-1064261689);
                                }
                            } catch (Throwable th) {
                                Process.setThreadPriority(threadPriority);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-771099370);
                                }
                                throw th;
                            }
                        } else {
                            interfaceC16820sZ.invoke();
                        }
                        return C0eB.A00;
                    }
                }, 693956227, 1, ((Boolean) c40561uP.A02.getValue()).booleanValue(), true);
                c40561uP.A01.add(c14160ng);
                C14120nc.A00().ATN(c14160ng);
            } else {
                List list = c40561uP.A01;
                C19L c19l = (C19L) c40561uP.A03.getValue();
                InterfaceC16620sF c206629Ct = new C206629Ct(c40641uX, null, 6);
                AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                Integer num = C05F.A00;
                C12W A012 = AbstractC23651Dv.A01(anonymousClass191, c19l);
                CompletableFuture completableFuture = new CompletableFuture();
                C110994zB c110994zB = new C110994zB(completableFuture, A012);
                completableFuture.handle((BiFunction) c110994zB);
                c110994zB.A0W(num, c110994zB, c206629Ct);
                list.add(completableFuture);
            }
            i++;
        } while (i < 95);
        C226418s A013 = C226218q.A01(c18720vz);
        A013.A0P(A013.A02, "SESSION_SCOPED_PROVIDER_INIT_END");
    }
}
