package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.TuL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65803TuL extends AbstractC18280vF {
    public C65803TuL() {
        super("mprotect", 397, 5, false, false);
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        DalvikInternals.mprotectExecCode();
    }
}
