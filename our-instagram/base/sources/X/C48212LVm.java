package X;

import android.view.View;
import com.instagram.clips.audio.soundsync.view.player.shared.SoundSyncPreviewView;

/* renamed from: X.LVm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48212LVm implements InterfaceC55932he {
    public Integer A00;
    public final C55942hf A01;
    public final C55942hf A02;
    public final InterfaceC09390do A03;
    public final View A04;
    public final C47275Kum A05;

    public C48212LVm(View view, C47275Kum c47275Kum) {
        C14360o3.A0B(view, 1);
        this.A04 = view;
        this.A05 = c47275Kum;
        this.A02 = new C55942hf(0.0d, 0.0d);
        this.A01 = new C55942hf(0.0d, 0.0d);
        this.A00 = C05F.A01;
        this.A03 = AbstractC37302Gc3.A0m(this, 19);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C44358Jix strokeProgress;
        C44361Jj0 foreGroundDrawable;
        C14360o3.A0B(c55982hj, 0);
        if (C14360o3.A0K(c55982hj.A05, this.A02)) {
            c55982hj.A09(this.A01);
            c55982hj.A02();
            c55982hj.A04();
            return;
        }
        C47275Kum c47275Kum = this.A05;
        Integer num = this.A00;
        C14360o3.A0B(num, 0);
        if (num != C05F.A00) {
            return;
        }
        SoundSyncPreviewView soundSyncPreviewView = c47275Kum.A00;
        strokeProgress = soundSyncPreviewView.getStrokeProgress();
        strokeProgress.A01();
        foreGroundDrawable = soundSyncPreviewView.getForeGroundDrawable();
        AbstractC43593JPy.A1V(foreGroundDrawable.A0B);
        soundSyncPreviewView.A06.setImageDrawable(null);
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        Integer num;
        Integer num2;
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        if (C14360o3.A0K(c55982hj.A05, this.A01)) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        int intValue = num.intValue();
        Integer num3 = this.A00;
        if (intValue != 0) {
            num2 = C05F.A01;
        } else {
            num2 = C05F.A00;
        }
        if (num3 == num2) {
            this.A04.setAlpha(f);
        }
        float f2 = ((float) (f * 0.15d)) + 1.0f;
        View view = this.A04;
        view.setScaleY(f2);
        view.setScaleX(f2);
    }
}
