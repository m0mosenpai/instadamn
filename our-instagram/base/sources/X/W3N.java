package X;

import android.graphics.RectF;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class W3N {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public RectF A05;
    public WDI A06;
    public XES A07;
    public MediaComposition A08;
    public OJQ A09;
    public VN4 A0A;
    public U7W A0B;
    public C70087W2j A0C;
    public File A0D;
    public String A0E;
    public String A0F;
    public HashSet A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.VN4, java.lang.Object] */
    public W3N(C69489VoC c69489VoC) {
        this.A05 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        this.A04 = -1L;
        this.A00 = -1L;
        this.A0H = false;
        this.A0I = false;
        this.A02 = -1L;
        this.A0G = new HashSet();
        this.A09 = null;
        try {
            this.A0A = new Object();
            this.A0D = c69489VoC.A0D;
            String str = c69489VoC.A0F;
            if (str != null) {
                this.A0F = str;
            }
            this.A08 = c69489VoC.A08;
            this.A05 = c69489VoC.A05;
            this.A04 = c69489VoC.A04;
            this.A00 = c69489VoC.A00;
            this.A0H = c69489VoC.A0H;
            this.A0I = c69489VoC.A0I;
            this.A07 = c69489VoC.A07;
            this.A06 = c69489VoC.A06;
            this.A0C = c69489VoC.A0C;
            this.A0L = c69489VoC.A0L;
            this.A0K = c69489VoC.A0K;
            this.A0J = c69489VoC.A0J;
            this.A0B = c69489VoC.A0B;
            this.A0P = c69489VoC.A0O;
            this.A0Q = c69489VoC.A0P;
            this.A0M = c69489VoC.A0M;
            this.A02 = c69489VoC.A03;
            this.A0A = c69489VoC.A0A;
            this.A0N = c69489VoC.A0N;
            this.A0O = c69489VoC.A0Q;
            this.A0G = c69489VoC.A0G;
            this.A09 = c69489VoC.A09;
            this.A0E = c69489VoC.A0E;
        } catch (C105764pn e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.VN4, java.lang.Object] */
    public W3N() {
        this.A05 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        this.A04 = -1L;
        this.A00 = -1L;
        this.A0H = false;
        this.A0I = false;
        this.A02 = -1L;
        this.A0G = new HashSet();
        this.A09 = null;
        try {
            this.A0A = new Object();
        } catch (C105764pn e) {
            throw new RuntimeException(e);
        }
    }
}
