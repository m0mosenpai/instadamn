package com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker;

import X.AbstractC110824yu;
import X.AbstractC61802rh;
import X.C3F5;
import X.C51107MiC;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class FaceEffectLinearLayoutManager extends LinearLayoutManager {
    public float A00;
    public AbstractC61802rh A01;
    public C51107MiC A02;
    public final Context A03;

    public FaceEffectLinearLayoutManager(Context context) {
        super(context, 0, false);
        this.A03 = context;
        this.A00 = 350.0f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        C51107MiC c51107MiC = new C51107MiC(this.A03, this);
        this.A02 = c51107MiC;
        ((AbstractC110824yu) c51107MiC).A00 = i;
        A10(c51107MiC);
    }

    @Override // X.AbstractC70663Fe
    public final int Bau() {
        return 0;
    }

    @Override // X.AbstractC70663Fe
    public final int Baw() {
        return 0;
    }
}
