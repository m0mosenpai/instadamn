package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.camera.mpfacade.CameraEffectFacadeIntf$State;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.LyricsPhrase;
import com.instagram.music.common.model.MusicAssetBeatInfo;
import com.instagram.music.common.model.WordOffset;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.83g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1815383g implements C82M {
    public ARAudioEffectData A00;
    public boolean A01;
    public final Context A02;
    public final AnonymousClass830 A03;
    public final C1813282k A04;
    public final IgCameraEffectsController A05;
    public final InterfaceC149836oc A06;
    public final C83J A07;
    public final C172017lW A08;
    public final C172007lV A09;
    public final C83I A0A;
    public final UserSession A0B;
    public final C83C A0C;
    public final InterfaceC09390do A0D;

    public final void A03() {
        IgCameraEffectsController igCameraEffectsController = this.A05;
        igCameraEffectsController.A06 = null;
        igCameraEffectsController.A04 = null;
        igCameraEffectsController.A03 = null;
        igCameraEffectsController.A05 = null;
        InterfaceC149836oc interfaceC149836oc = this.A06;
        if (interfaceC149836oc != null) {
            interfaceC149836oc.EP3(null);
        }
        C1813282k c1813282k = this.A04;
        InterfaceC174857qL interfaceC174857qL = c1813282k.A04;
        if (interfaceC174857qL != null) {
            interfaceC174857qL.AP0(true);
        }
        c1813282k.A07.A00 = null;
    }

    public final void A06(C83L c83l) {
        C14360o3.A0B(c83l, 0);
        this.A05.A0Q.add(c83l);
    }

    public final void A07(C83L c83l) {
        C14360o3.A0B(c83l, 0);
        this.A05.A0Q.remove(c83l);
    }

    public final void A08(C83N c83n) {
        C14360o3.A0B(c83n, 0);
        this.A05.A0R.add(c83n);
    }

    public final void A09(C83N c83n) {
        C14360o3.A0B(c83n, 0);
        this.A05.A0R.remove(c83n);
    }

    public final boolean A0B(MotionEvent motionEvent) {
        C8Z9 A00;
        C14360o3.A0B(motionEvent, 0);
        C83C c83c = this.A0C;
        if (c83c != null && (A00 = c83c.A00()) != null) {
            A00.A04(true);
        }
        InterfaceC174857qL interfaceC174857qL = this.A04.A04;
        if (interfaceC174857qL != null && interfaceC174857qL.Du7(motionEvent)) {
            return true;
        }
        return false;
    }

    public C1815383g(Context context, GalleryPickerServiceDataSource galleryPickerServiceDataSource, AnonymousClass830 anonymousClass830, C1813282k c1813282k, IgCameraEffectsController igCameraEffectsController, InterfaceC149836oc interfaceC149836oc, C83J c83j, UserSession userSession, C172017lW c172017lW, C172007lV c172007lV, C83C c83c, C83I c83i, InterfaceC09390do interfaceC09390do) {
        C14360o3.A0B(c1813282k, 15);
        C14360o3.A0B(igCameraEffectsController, 16);
        C14360o3.A0B(interfaceC09390do, 17);
        this.A0B = userSession;
        this.A03 = anonymousClass830;
        this.A0C = c83c;
        this.A09 = c172007lV;
        this.A08 = c172017lW;
        this.A0A = c83i;
        this.A07 = c83j;
        this.A06 = interfaceC149836oc;
        this.A04 = c1813282k;
        this.A05 = igCameraEffectsController;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A02 = applicationContext;
        this.A0D = interfaceC09390do;
        if (interfaceC149836oc != null && galleryPickerServiceDataSource != null) {
            interfaceC149836oc.EUu(galleryPickerServiceDataSource);
        }
        if (!C2B0.A00(C05F.A0R)) {
            C83J c83j2 = this.A07;
            if (c83j2 != null) {
                c83j2.A02 = this;
                c83j2.A01 = this;
                A08(c83j2.A07);
                A06(c83j2.A06);
            }
            C1814983c c1814983c = this.A05.A0M;
            c1814983c.A03 = this.A09;
            c1814983c.A02 = this.A08;
            c1814983c.A04 = this.A0A;
        }
    }

    public static final void A00(C1815383g c1815383g, Integer num) {
        C83J c83j;
        double d;
        JSONObject jSONObject;
        ARAudioEffectData aRAudioEffectData = c1815383g.A00;
        if (aRAudioEffectData != null && c1815383g.A01 && (c83j = c1815383g.A07) != null) {
            if (!c83j.A04 && !c83j.A03) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    List<LyricsPhrase> list = aRAudioEffectData.A01;
                    JSONArray jSONArray = null;
                    if (list == null) {
                        jSONObject = null;
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        for (LyricsPhrase lyricsPhrase : list) {
                            if (lyricsPhrase.A02 != null) {
                                JSONObject jSONObject4 = new JSONObject();
                                try {
                                    double d2 = lyricsPhrase.A00 / 1000.0d;
                                    if (lyricsPhrase.A02 != null) {
                                        jSONObject4.put("startTime", d2);
                                        jSONObject4.put("endTime", (((WordOffset) AbstractC001800i.A0K(r0)).A01 / 1000.0d) + d2);
                                        jSONObject4.put("text", lyricsPhrase.A01);
                                        JSONArray jSONArray3 = new JSONArray();
                                        String str = lyricsPhrase.A01;
                                        List<WordOffset> list2 = lyricsPhrase.A02;
                                        if (list2 != null) {
                                            for (WordOffset wordOffset : list2) {
                                                int i = wordOffset.A02;
                                                int i2 = wordOffset.A00;
                                                int i3 = wordOffset.A03;
                                                int i4 = wordOffset.A01;
                                                boolean z = wordOffset.A04;
                                                JSONObject jSONObject5 = new JSONObject();
                                                String substring = str.substring(i, i2);
                                                C14360o3.A07(substring);
                                                double d3 = i3 / 1000.0d;
                                                double d4 = i4 / 1000.0d;
                                                try {
                                                    jSONObject5.put("startIndex", i);
                                                    jSONObject5.put("endIndex", i2);
                                                    jSONObject5.put("hasTrailingWhitespace", z);
                                                    jSONObject5.put("startTimeOffset", d3);
                                                    jSONObject5.put("endTimeOffset", d4);
                                                    jSONObject5.put("wordText", substring);
                                                    jSONArray3.put(jSONObject5);
                                                } catch (JSONException e) {
                                                    e.getMessage();
                                                }
                                            }
                                        }
                                        jSONObject4.put("words", jSONArray3);
                                    }
                                } catch (JSONException e2) {
                                    e2.getMessage();
                                }
                                jSONArray2.put(jSONObject4);
                            }
                        }
                        JSONObject jSONObject6 = new JSONObject();
                        try {
                            jSONObject6.put("phrases", jSONArray2);
                            jSONObject = jSONObject6;
                        } catch (JSONException unused) {
                            jSONObject = null;
                        }
                    }
                    List<MusicAssetBeatInfo> list3 = aRAudioEffectData.A00;
                    if (list3 != null) {
                        jSONArray = new JSONArray();
                        for (MusicAssetBeatInfo musicAssetBeatInfo : list3) {
                            int i5 = musicAssetBeatInfo.A00;
                            boolean z2 = musicAssetBeatInfo.A03;
                            boolean z3 = musicAssetBeatInfo.A01;
                            boolean z4 = musicAssetBeatInfo.A02;
                            boolean z5 = musicAssetBeatInfo.A04;
                            JSONObject jSONObject7 = new JSONObject();
                            double d5 = i5 / 1000.0d;
                            try {
                                jSONObject7.put("is_down_beat_key", z3);
                                jSONObject7.put("is_phrase_key", z4);
                                jSONObject7.put("is_strong_key", z2);
                                jSONObject7.put("is_twobar_key", z5);
                                jSONObject7.put("time_in_seconds_key", d5);
                                jSONArray.put(jSONObject7);
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                    jSONObject3.put("audioStartTime", aRAudioEffectData.A03);
                    jSONObject3.put("audioDuration", aRAudioEffectData.A02);
                    jSONObject3.put("clipStart", aRAudioEffectData.A05);
                    jSONObject3.put("clipEnd", aRAudioEffectData.A04);
                    jSONObject3.put("audioAssetId", aRAudioEffectData.A07);
                    jSONObject3.put(DialogModule.KEY_TITLE, aRAudioEffectData.A08);
                    jSONObject3.put("artistName", aRAudioEffectData.A06);
                    Object obj = jSONArray;
                    if (jSONArray == null) {
                        obj = JSONObject.NULL;
                    }
                    jSONObject3.put("beats", obj);
                    Object obj2 = jSONObject;
                    if (jSONObject == null) {
                        obj2 = JSONObject.NULL;
                    }
                    jSONObject3.put("lyrics", obj2);
                } catch (JSONException e3) {
                    e3.getMessage();
                }
                jSONObject2.put("arAudioEffectData", jSONObject3);
                C1815383g c1815383g2 = c83j.A02;
                if (c1815383g2 != null) {
                    c1815383g2.A0A(jSONObject2);
                }
                c83j.A05 = false;
                if (num == null) {
                    d = aRAudioEffectData.A05;
                } else {
                    d = num.intValue();
                }
                c83j.A00 = d;
            } catch (JSONException e4) {
                e4.getMessage();
            }
        }
    }

    public final CameraAREffect A01() {
        IgCameraEffectsController igCameraEffectsController = this.A05;
        AnonymousClass818 anonymousClass818 = igCameraEffectsController.A07;
        if (anonymousClass818 != null && anonymousClass818.isEnabled()) {
            return igCameraEffectsController.A09;
        }
        return null;
    }

    public final String A02() {
        HashMap hashMap = new HashMap(this.A05.A0H.A00);
        if (hashMap.isEmpty()) {
            return null;
        }
        return new JSONObject(hashMap).toString();
    }

    public final void A04(int i) {
        C83J c83j = this.A07;
        if (c83j != null) {
            if (!c83j.A04 && !c83j.A03 && !c83j.A05) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("audioTime", (i / 1000.0d) + c83j.A00);
                C1815383g c1815383g = c83j.A02;
                if (c1815383g == null) {
                    return;
                }
                c1815383g.A0A(jSONObject);
            } catch (JSONException e) {
                e.getMessage();
            }
        }
    }

    public final void A05(InterfaceC189918bA interfaceC189918bA) {
        IgCameraEffectsController igCameraEffectsController = this.A05;
        igCameraEffectsController.A01 = interfaceC189918bA;
        AnonymousClass818 anonymousClass818 = igCameraEffectsController.A07;
        if (anonymousClass818 != null) {
            anonymousClass818.A0F(interfaceC189918bA);
        }
    }

    public final void A0A(JSONObject jSONObject) {
        C1814883b c1814883b = this.A05.A0G;
        C14360o3.A07(c1814883b);
        c1814883b.A00(jSONObject);
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ void A7T(Parcelable parcelable) {
        CameraEffectFacadeIntf$State cameraEffectFacadeIntf$State = (CameraEffectFacadeIntf$State) parcelable;
        if (cameraEffectFacadeIntf$State != null) {
            this.A00 = cameraEffectFacadeIntf$State.A00;
            this.A01 = cameraEffectFacadeIntf$State.A01;
        }
        C83J c83j = this.A07;
        if (c83j != null) {
            c83j.A02 = this;
            c83j.A01 = this;
            A08(c83j.A07);
            A06(c83j.A06);
        }
        C1814983c c1814983c = this.A05.A0M;
        c1814983c.A03 = this.A09;
        c1814983c.A02 = this.A08;
        c1814983c.A04 = this.A0A;
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ Parcelable ANh() {
        C83J c83j = this.A07;
        if (c83j != null) {
            c83j.A02 = null;
            c83j.A01 = null;
            A09(c83j.A07);
            A07(c83j.A06);
        }
        C1814983c c1814983c = this.A05.A0M;
        c1814983c.A03 = null;
        c1814983c.A02 = null;
        c1814983c.A04 = null;
        return new CameraEffectFacadeIntf$State(this.A00, this.A01);
    }
}
