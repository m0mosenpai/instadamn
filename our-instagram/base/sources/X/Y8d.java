package X;

import androidx.media3.common.Metadata;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y8d implements YNF {
    public final int A00;
    public final Object A01;

    public Y8d(C72855XpB c72855XpB, int i) {
        this.A00 = i;
        this.A01 = c72855XpB;
    }

    @Override // X.YNF
    public final void CP5(Object obj) {
        switch (this.A00) {
            case 0:
                Y4C y4c = (Y4C) this.A01;
                Y8T y8t = Y8T.$redex_init_class;
                ((YQ5) obj).DYz(y4c.A0E, y4c.A00);
                return;
            case 1:
                Y4C y4c2 = (Y4C) this.A01;
                Y8T y8t2 = Y8T.$redex_init_class;
                ((YQ5) obj).DZD(y4c2.A02);
                return;
            case 2:
                Y4C y4c3 = (Y4C) this.A01;
                Y8T y8t3 = Y8T.$redex_init_class;
                ((YQ5) obj).DND(y4c3.A07());
                return;
            case 3:
                Y4C y4c4 = (Y4C) this.A01;
                Y8T y8t4 = Y8T.$redex_init_class;
                ((YQ5) obj).DZ3(y4c4.A05);
                return;
            case 4:
                Y4C y4c5 = (Y4C) this.A01;
                Y8T y8t5 = Y8T.$redex_init_class;
                ((YQ5) obj).DZI(y4c5.A07);
                return;
            case 5:
                Y4C y4c6 = (Y4C) this.A01;
                Y8T y8t6 = Y8T.$redex_init_class;
                ((YQ5) obj).DZF(y4c6.A07);
                return;
            case 6:
                Y4C y4c7 = (Y4C) this.A01;
                Y8T y8t7 = Y8T.$redex_init_class;
                ((YQ5) obj).Dur(y4c7.A0B.A00);
                return;
            case 7:
                Y1V y1v = (Y1V) this.A01;
                Y8T y8t8 = Y8T.$redex_init_class;
                ((YQ5) obj).DS4(y1v);
                return;
            case 8:
                Y4C y4c8 = (Y4C) this.A01;
                Y8T y8t9 = Y8T.$redex_init_class;
                ((YQ5) obj).DNB(y4c8.A0D);
                return;
            case 9:
                Y4C y4c9 = (Y4C) this.A01;
                Y8T y8t10 = Y8T.$redex_init_class;
                ((YQ5) obj).DZJ(y4c9.A0E, y4c9.A01);
                return;
            case 10:
                Y4C y4c10 = (Y4C) this.A01;
                Y8T y8t11 = Y8T.$redex_init_class;
                ((YQ5) obj).DZB(y4c10.A01);
                return;
            case 11:
                ((YQ5) obj).CyW(((Y8T) this.A01).A07);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((YQ5) obj).onCues((List) this.A01);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Y8T y8t12 = ((Y8E) this.A01).A00;
                Y8T y8t13 = Y8T.$redex_init_class;
                ((YQ5) obj).DS4(y8t12.A05);
                return;
            case 14:
                ((YQ5) obj).DTY((Metadata) this.A01);
                return;
            case Process.SIGTERM /* 15 */:
                ((YQ5) obj).D8q((C73290Xzd) this.A01);
                return;
            case 16:
                ((YQ5) obj).Dzv((Y1N) this.A01);
                return;
            default:
                return;
        }
    }

    public Y8d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
