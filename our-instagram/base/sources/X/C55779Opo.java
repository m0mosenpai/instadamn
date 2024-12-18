package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Opo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55779Opo implements MediaEffect {
    public final C47Z A00;
    public final boolean A01;

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final void FA2(MediaEffect mediaEffect) {
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean CSs() {
        return AbstractC166987dD.A1b(this.A00.A4Y);
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final boolean Ej4() {
        return this.A01;
    }

    public C55779Opo(C47Z c47z, boolean z) {
        this.A00 = c47z;
        this.A01 = z;
    }

    @Override // com.facebook.videolite.transcoder.base.composition.MediaEffect
    public final JSONObject EqN() {
        boolean z;
        boolean z2;
        List A01;
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("class", "PendingMediaEffect");
        } catch (JSONException unused) {
        }
        C47Z c47z = this.A00;
        String str = c47z.A2k;
        if (str != null) {
            z = MSY.A1Z(str);
        } else {
            z = false;
        }
        try {
            A0q.put("hasImageOverlay", Boolean.valueOf(z));
        } catch (JSONException unused2) {
        }
        try {
            A0q.put("hasDynamicSticker", Boolean.valueOf(c47z.A57));
        } catch (JSONException unused3) {
        }
        try {
            A0q.put("hasTrimEdits", Boolean.valueOf(AbstractC50707Ma2.A02(c47z)));
        } catch (JSONException unused4) {
        }
        try {
            A0q.put("isPhotoToVideo", Boolean.valueOf(c47z.A5j));
        } catch (JSONException unused5) {
        }
        try {
            A0q.put("isCoverFrameEdited", Boolean.valueOf(c47z.A5L));
        } catch (JSONException unused6) {
        }
        try {
            A0q.put("isCoverFromCustomPhoto", Boolean.valueOf(c47z.A5M));
        } catch (JSONException unused7) {
        }
        try {
            A0q.put("hasMusicOverlay", Boolean.valueOf(AbstractC50707Ma2.A00(c47z)));
        } catch (JSONException unused8) {
        }
        try {
            A0q.put("isClipsEdited", Boolean.valueOf(c47z.A5I));
        } catch (JSONException unused9) {
        }
        try {
            A0q.put("isBoomerangV2", Boolean.valueOf(c47z.A5G));
        } catch (JSONException unused10) {
        }
        try {
            A0q.put("isStackMedia", Boolean.valueOf(c47z.A5u));
        } catch (JSONException unused11) {
        }
        try {
            A0q.put("useSingleTranscode", Boolean.valueOf(c47z.A61));
        } catch (JSONException unused12) {
        }
        TransformMatrixConfig transformMatrixConfig = c47z.A16;
        if (transformMatrixConfig == null) {
            z2 = false;
        } else {
            z2 = !transformMatrixConfig.A08.A01();
        }
        try {
            A0q.put("hasPinchToZoom", Boolean.valueOf(z2));
        } catch (JSONException unused13) {
        }
        C115595Kt c115595Kt = c47z.A1P;
        boolean z3 = false;
        if (c115595Kt != null && (A01 = c115595Kt.A01()) != null && A01.size() > 1) {
            z3 = true;
        }
        try {
            A0q.put("isStitchedVideo", Boolean.valueOf(z3));
        } catch (JSONException unused14) {
        }
        try {
            A0q.put("isFromStoryDrafts", Boolean.valueOf(c47z.A5W));
        } catch (JSONException unused15) {
        }
        try {
            A0q.put("mediaType", c47z.A1G);
        } catch (JSONException unused16) {
        }
        String str2 = c47z.A3C;
        if (str2 != null) {
            try {
                A0q.put("navigationChain", str2);
            } catch (JSONException unused17) {
            }
        }
        try {
            A0q.put("isAudioMuted", Boolean.valueOf(c47z.A5F));
        } catch (JSONException unused18) {
        }
        String str3 = c47z.A2V;
        if (str3 != null) {
            try {
                A0q.put("cameraCaptureType", str3);
            } catch (JSONException unused19) {
            }
        }
        String str4 = c47z.A2h;
        if (str4 != null) {
            try {
                A0q.put("creationSurface", str4);
            } catch (JSONException unused20) {
            }
        }
        String str5 = c47z.A2Y;
        if (str5 != null) {
            try {
                A0q.put("canvasModeFormat", str5);
            } catch (JSONException unused21) {
            }
        }
        boolean z4 = true;
        try {
            A0q.put("hasPrecaptureAREffects", Boolean.valueOf(AbstractC167007dF.A1W(c47z.A2o)));
        } catch (JSONException unused22) {
        }
        try {
            A0q.put("hasPostcaptureAREffects", Boolean.valueOf(AbstractC167007dF.A1W(c47z.A10)));
        } catch (JSONException unused23) {
        }
        C55W c55w = c47z.A1a;
        if (c55w == null || c55w.A0P == null) {
            z4 = false;
        }
        try {
            A0q.put("hasColorFilter", Boolean.valueOf(z4));
        } catch (JSONException unused24) {
        }
        try {
            A0q.put("isLandscape", Boolean.valueOf(c47z.A5x));
        } catch (JSONException unused25) {
        }
        return A0q;
    }
}
