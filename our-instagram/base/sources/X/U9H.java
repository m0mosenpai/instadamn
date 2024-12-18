package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.videolite.transcoder.resizer.DummySurface;

/* loaded from: classes11.dex */
public final class U9H extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public DummySurface A01;
    public RunnableC71643Wxq A02;
    public Error A03;
    public RuntimeException A04;

    public U9H() {
        super("DummySurface");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:133:0x01c2
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Finally extract failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U9H.handleMessage(android.os.Message):boolean");
    }
}
