package X;

import android.widget.SeekBar;
import com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OlR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55533OlR implements SeekBar.OnSeekBarChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C55533OlR(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.A00 != 0) {
            C14360o3.A0B(seekBar, 0);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.A01;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
            if (z) {
                C26650Bpl.A03(AbstractC124845kp.A01(seekBar), seekBar.getMax(), i);
                return;
            }
            return;
        }
        C6FG c6fg = (C6FG) this.A01;
        C102884kP c102884kP = (C102884kP) this.A02;
        C54575O9c c54575O9c = (C54575O9c) AnonymousClass634.A06(c6fg, c102884kP);
        if (c54575O9c == null) {
            return;
        }
        C53641Nnm c53641Nnm = c54575O9c.A02;
        if (c53641Nnm != null) {
            c53641Nnm.A00 = i;
            List list = c53641Nnm.A03;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (A1B != null) {
                    A0q.add(AbstractC001900j.A0G("/parameter", AbstractC001900j.A0G("/value", A1B)));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            O6T o6t = O6T.A01;
            if (o6t == null) {
                o6t = new O6T();
                O6T.A01 = o6t;
            }
            Iterator it2 = o6t.A00.iterator();
            while (it2.hasNext()) {
                CommonSparkAvatarPreviewController commonSparkAvatarPreviewController = (CommonSparkAvatarPreviewController) it2.next();
                float f = i / 100.0f;
                HashMap A1G = AbstractC166987dD.A1G();
                Iterator it3 = A0q.iterator();
                while (it3.hasNext()) {
                    A1G.put(it3.next(), Float.valueOf(f));
                }
                FoaLiveEditingProvider foaLiveEditingProvider = commonSparkAvatarPreviewController.A00;
                if (foaLiveEditingProvider != null) {
                    C55127Obo c55127Obo = foaLiveEditingProvider.A02;
                    if (c55127Obo == null) {
                        C14360o3.A0F("commonLiveEditingProvider");
                        throw C00O.createAndThrow();
                    }
                    c55127Obo.A0B.A0A(A1G);
                }
            }
        }
        C53641Nnm c53641Nnm2 = c54575O9c.A02;
        if (c53641Nnm2 == null || c53641Nnm2.A05) {
            return;
        }
        AbstractC166987dD.A1Z(new C57172PZq(c6fg, c102884kP, c102884kP.A0B(42), (InterfaceC23621Ds) null, i), AbstractC50523MSb.A0e());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.A00 != 0) {
            C14360o3.A0B(seekBar, 0);
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.A01;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C53641Nnm c53641Nnm;
        if (this.A00 != 0) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.A01;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch((SeekBar) this.A02);
                return;
            }
            return;
        }
        C6FG c6fg = (C6FG) this.A01;
        C102884kP c102884kP = (C102884kP) this.A02;
        C54575O9c c54575O9c = (C54575O9c) AnonymousClass634.A06(c6fg, c102884kP);
        if (c54575O9c == null || (c53641Nnm = c54575O9c.A02) == null || !c53641Nnm.A05) {
            return;
        }
        AbstractC166987dD.A1Z(new PZ3(c102884kP, c53641Nnm, c6fg, c102884kP.A0B(42), (InterfaceC23621Ds) null, 2), AbstractC50523MSb.A0e());
    }
}
