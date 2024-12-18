package X;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.PwU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58501PwU extends AbstractRunnableC14200nk {
    public final C58502PwV A00;
    public final Object A01;
    public final String A02;
    public final /* synthetic */ C25301Lk A03;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC71443Ii abstractC71443Ii;
        C25301Lk c25301Lk;
        C59732oG ARB;
        try {
            c25301Lk = this.A03;
            ARB = C25301Lk.A00(c25301Lk).ARB(this.A02);
        } catch (IOException e) {
            e = e;
            abstractC71443Ii = null;
        }
        if (ARB.A00 != null) {
            abstractC71443Ii = (AbstractC71443Ii) ARB.A00();
            try {
                try {
                    abstractC71443Ii.write(c25301Lk.A00.EOt(this.A01).getBytes(AbstractC58318PtA.A0u()));
                    abstractC71443Ii.A03();
                } catch (IOException e2) {
                    e = e2;
                    C0w9.A06("JSONDiskSerializer_Cannot_Write_OutputStream", "output stream cannot be written", e);
                    if (abstractC71443Ii == null) {
                        return;
                    }
                    return;
                }
                return;
            } finally {
                if (abstractC71443Ii != null) {
                    abstractC71443Ii.A02();
                }
            }
        }
        C0w9.A03("JSONDiskSerializer_Missing_Output_File", "output file not available");
        throw new FileNotFoundException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58501PwU(C25301Lk c25301Lk, Object obj, String str) {
        super(-13);
        C58502PwV c58502PwV = new C58502PwV(c25301Lk);
        this.A03 = c25301Lk;
        this.A02 = str;
        this.A01 = obj;
        this.A00 = c58502PwV;
    }
}
