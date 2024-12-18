package X;

import android.content.Context;
import android.view.View;
import com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams;

/* loaded from: classes8.dex */
public final class M54 implements Runnable {
    public final /* synthetic */ ContentNotesImmersiveMimicryParams A00;
    public final /* synthetic */ C47928LEx A01;
    public final /* synthetic */ L5D A02;

    public M54(ContentNotesImmersiveMimicryParams contentNotesImmersiveMimicryParams, C47928LEx c47928LEx, L5D l5d) {
        this.A01 = c47928LEx;
        this.A02 = l5d;
        this.A00 = contentNotesImmersiveMimicryParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47928LEx c47928LEx = this.A01;
        L5D l5d = this.A02;
        ContentNotesImmersiveMimicryParams contentNotesImmersiveMimicryParams = this.A00;
        View view = l5d.A01;
        Context context = view.getContext();
        view.setVisibility(0);
        C14360o3.A0A(context);
        float A00 = AbstractC13690mv.A00(context, 20.0f);
        float A002 = AbstractC13690mv.A00(context, 52.0f);
        view.setScaleX(0.5f);
        view.setScaleY(0.5f);
        ContentNotesCoordinates contentNotesCoordinates = contentNotesImmersiveMimicryParams.A01;
        view.setTranslationX((contentNotesCoordinates.A00 - A00) - view.getX());
        view.setTranslationY((contentNotesCoordinates.A01 - A002) - view.getY());
        AbstractC43593JPy.A0E(view.animate(), 1.0f).translationX(0.0f).translationY(0.0f).setListener(new JX2(c47928LEx, 6)).start();
    }
}
