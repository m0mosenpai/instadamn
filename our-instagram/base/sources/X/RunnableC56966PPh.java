package X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.PPh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56966PPh implements Runnable {
    public final /* synthetic */ C54795OJn A00;
    public final /* synthetic */ List A01;

    public RunnableC56966PPh(C54795OJn c54795OJn, List list) {
        this.A01 = list;
        this.A00 = c54795OJn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C54795OJn c54795OJn;
        ExecutionException executionException;
        try {
            try {
                try {
                    List<C55176Odf> list = this.A01;
                    if (list.size() > 1) {
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        for (C55176Odf c55176Odf : list) {
                            ((List) JQ0.A0h(c55176Odf.A0M, A1I)).add(c55176Odf.A0N.getPath());
                        }
                        List A18 = MSW.A18(EnumC1125356h.VIDEO, A1I);
                        if (A18 == null) {
                            A18 = C16930sl.A00;
                        }
                        List A182 = MSW.A18(EnumC1125356h.AUDIO, A1I);
                        if (A182 == null) {
                            A182 = C16930sl.A00;
                        }
                        if (A182.size() <= 1) {
                            C54795OJn c54795OJn2 = this.A00;
                            ArrayList A0i = AbstractC167007dF.A0i(A182);
                            Iterator it = A182.iterator();
                            while (it.hasNext()) {
                                A0i.add(new OTG(AbstractC166987dD.A11(AbstractC166987dD.A1B(it)), 0));
                            }
                            ArrayList A0i2 = AbstractC167007dF.A0i(A18);
                            Iterator it2 = A18.iterator();
                            while (it2.hasNext()) {
                                A0i2.add(new OTG(AbstractC166987dD.A11(AbstractC166987dD.A1B(it2))));
                            }
                            File A11 = AbstractC166987dD.A11(c54795OJn2.A06);
                            X9U x9u = WGM.A01;
                            try {
                                WGM wgm = WGM.A00;
                                WGM.A05(A0i2);
                                WGM.A04(wgm, x9u, A11, A0i2, A0i, 1048576);
                            } catch (C8CK e) {
                                C14360o3.A0B("Exception thrown while stitching the media files", 1);
                                throw new Exception("Exception thrown while stitching the media files", e);
                            } catch (IOException e2) {
                                C14360o3.A0B("Exception thrown while stitching the media files", 1);
                                throw new Exception("Exception thrown while stitching the media files", e2);
                            }
                        } else {
                            throw AbstractC166987dD.A14("Cannot stitch a video file with multiple audio tracks");
                        }
                    }
                    c54795OJn = this.A00;
                    C47Z c47z = c54795OJn.A05;
                    c47z.A0j.A02 = true;
                    String str = c54795OJn.A06;
                    c47z.A0g(str);
                    c47z.A0f(str);
                    c47z.A0O();
                    C25A.A00(c54795OJn.A04).A0A();
                } catch (C8CK e3) {
                    c54795OJn = this.A00;
                    c54795OJn.A00 = new ExecutionException(e3);
                    C0w9.A07("IGVideoResultProcessor", e3);
                }
            } catch (IOException e4) {
                c54795OJn = this.A00;
                executionException = new ExecutionException(e4);
                c54795OJn.A00 = executionException;
                c54795OJn.A01 = false;
                c54795OJn.A07.countDown();
            } catch (RuntimeException e5) {
                c54795OJn = this.A00;
                executionException = new ExecutionException(e5);
                c54795OJn.A00 = executionException;
                c54795OJn.A01 = false;
                c54795OJn.A07.countDown();
            }
            c54795OJn.A01 = false;
            c54795OJn.A07.countDown();
        } catch (Throwable th) {
            C54795OJn c54795OJn3 = this.A00;
            c54795OJn3.A01 = false;
            c54795OJn3.A07.countDown();
            throw th;
        }
    }
}
