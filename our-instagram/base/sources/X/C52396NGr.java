package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NGr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52396NGr extends AbstractRunnableC14200nk {
    public final Context A00;
    public final UserSession A01;
    public final C47Z A02;
    public final InterfaceC70363Du A03;
    public final C54095Nvt A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52396NGr(Context context, UserSession userSession, C47Z c47z, InterfaceC70363Du interfaceC70363Du, C54095Nvt c54095Nvt) {
        super(442, 3, false, false);
        C14360o3.A0B(c54095Nvt, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = interfaceC70363Du;
        this.A02 = c47z;
        this.A04 = c54095Nvt;
    }

    private final void A01(C47s c47s) {
        List list = c47s.A06;
        C19700xy c19700xy = C17280tP.A4E;
        if (!c19700xy.A00().A0a()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((C51580MqY) it.next()).A06;
                if (str != null && MSY.A1Z(str)) {
                    AbstractC13530mf.A09(str);
                }
            }
        }
        if (!c19700xy.A00().A0a()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = ((C51580MqY) it2.next()).A05;
                if (str2 != null && MSY.A1Z(str2)) {
                    AbstractC13530mf.A09(str2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x019b, code lost:
    
        if (r1 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0243, code lost:
    
        r4.recycle();
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x049f: IGET (r1 I:X.3Du) = (r3 I:X.NGr) A[Catch: all -> 0x04d0] (LINE:1183) X.NGr.A03 X.3Du, block:B:186:0x049a */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x04ad: IGET (r1 I:X.3Du) = (r3 I:X.NGr) A[Catch: all -> 0x04d0] (LINE:1197) X.NGr.A03 X.3Du, block:B:192:0x04a8 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x04bb: IGET (r1 I:X.3Du) = (r3 I:X.NGr) A[Catch: all -> 0x04d0] (LINE:1211) X.NGr.A03 X.3Du, block:B:189:0x04b6 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x04c8: IGET (r1 I:X.3Du) = (r3 I:X.NGr) A[Catch: all -> 0x04d0] (LINE:1224) X.NGr.A03 X.3Du, block:B:195:0x04c3 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x04d1: IGET (r0 I:X.47Z) = (r3 I:X.NGr) A[Catch: IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x04d9, IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x04d9, IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x04d9, IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x04d9] (LINE:1233) X.NGr.A02 X.47Z, block:B:183:0x04d1 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.NGr] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.NGr] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.NGr] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.NGr] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.NGr] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52396NGr.run():void");
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C50703MZy c50703MZy) {
        interfaceC02590Ai.A9K(AbstractC111324zv.A00(2243), c50703MZy.A0D());
        interfaceC02590Ai.A9K("dimension_height", c50703MZy.A0B());
    }
}
