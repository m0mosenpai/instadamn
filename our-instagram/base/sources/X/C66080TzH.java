package X;

import com.google.common.collect.ImmutableList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.TzH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66080TzH extends AbstractRunnableC14200nk {
    public final /* synthetic */ C66053Tyq A00;
    public final /* synthetic */ AnonymousClass435 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66080TzH(C66053Tyq c66053Tyq, AnonymousClass435 anonymousClass435) {
        super(1132146482, 2, false, true);
        this.A00 = c66053Tyq;
        this.A01 = anonymousClass435;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66082TzJ c66082TzJ;
        C66053Tyq c66053Tyq = this.A00;
        C121125e6 c121125e6 = c66053Tyq.A07;
        AnonymousClass435 anonymousClass435 = this.A01;
        ReentrantReadWriteLock reentrantReadWriteLock = c121125e6.A00;
        if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
            try {
                C66074TzB c66074TzB = (C66074TzB) anonymousClass435.A01;
                if (c66074TzB != null && (c66082TzJ = (C66082TzJ) c66074TzB.getOptionalTreeField(0, "xfb_igd_search_nullstate_prompts", C66082TzJ.class, -496976983)) != null) {
                    C66054Tyr c66054Tyr = c66053Tyq.A03;
                    c66054Tyr.A00.A00();
                    ImmutableList requiredCompactedTreeListField = c66082TzJ.getRequiredCompactedTreeListField(0, "nullstate_prompts", C66083TzK.class, -1524231350);
                    if (requiredCompactedTreeListField != null) {
                        try {
                            C11T.A05("This operation can't be run on UI thread.");
                            InterfaceC19610xo ARD = c66054Tyr.A02.ARD();
                            ARD.AHW();
                            ARD.E7G("last_sync_prompts_timestamp_sec", AbstractC31177DnL.A06());
                            C1LC A0I = AbstractC43592JPx.A0I(requiredCompactedTreeListField);
                            while (A0I.hasNext()) {
                                C66083TzK c66083TzK = (C66083TzK) A0I.next();
                                String A0R = AnonymousClass001.A0R("prompt:", c66083TzK.getOptionalStringField(1, "prompt"));
                                StringBuilder sb = new StringBuilder();
                                sb.append((EnumC50681MYz) c66083TzK.getOptionalEnumField(0, "prompt_type", EnumC50681MYz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE));
                                sb.append(',');
                                sb.append(c66083TzK.getOptionalStringField(3, "prompt_fbid"));
                                sb.append(',');
                                sb.append(c66083TzK.getOptionalStringField(2, "emoji"));
                                ARD.E7K(A0R, sb.toString());
                            }
                            ARD.apply();
                        } catch (Throwable th) {
                            C0w9.A06("GenAICache", AbstractC111324zv.A00(1831), th);
                        }
                    }
                    c66053Tyq.A06 = false;
                    c66053Tyq.A01 = c66054Tyr.A00();
                }
                return;
            } finally {
                AbstractC65702TsY.A1W(reentrantReadWriteLock);
            }
        }
        throw new InterruptedException("Failed to claim lock after 1 seconds");
    }
}
