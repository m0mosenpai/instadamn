package com.instagram.camera.effect.models;

import X.AGB;
import X.AbstractC120375cg;
import X.AbstractC12990ll;
import X.AbstractC25651Mw;
import X.AbstractC50102Ry;
import X.AnonymousClass001;
import X.C05F;
import X.C0w9;
import X.C120385ch;
import X.C120415ck;
import X.C120425cl;
import X.C16V;
import X.C173027nG;
import X.C206139Av;
import X.C25671My;
import X.EnumC77213d7;
import X.InterfaceC120325cX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.effect.AREffect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class CameraAREffect extends AREffect implements InterfaceC120325cX {
    public static final Parcelable.Creator CREATOR = new C206139Av(45);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public SparkVisionCapability A04;
    public ImageUrl A05;
    public ImageUrl A06;
    public ImageUrl A07;
    public ImageUrl A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public List A0T;
    public List A0U;
    public List A0V;
    public List A0W;
    public List A0X;
    public List A0Y;
    public Map A0Z;
    public Set A0a;
    public Set A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public volatile JSONObject A0k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            CameraAREffect cameraAREffect = (CameraAREffect) obj;
            if (!AbstractC50102Ry.A00(this.A0J, cameraAREffect.A0J) || !AbstractC50102Ry.A00(this.A0M, cameraAREffect.A0M) || !AbstractC50102Ry.A00(this.A0K, cameraAREffect.A0K)) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList A0E() {
        ARRequestAsset.CompressionMethod fromString;
        List<AGB> list = this.A0U;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (AGB agb : list) {
                String str = agb.A01;
                str.getClass();
                String str2 = agb.A00;
                str2.getClass();
                List list2 = agb.A03;
                String str3 = agb.A02;
                str3.getClass();
                String str4 = this.A0H;
                if (str4 == null) {
                    fromString = ARRequestAsset.CompressionMethod.ZIP;
                } else {
                    fromString = ARRequestAsset.CompressionMethod.fromString(str4);
                }
                arrayList.add(new AREffectAsyncAsset(str, str2, list2, str3, fromString, false));
            }
            return arrayList;
        }
        return null;
    }

    public final HashMap A0F() {
        HashMap hashMap = new HashMap();
        for (C173027nG c173027nG : this.A0X) {
            hashMap.put(c173027nG.A02, c173027nG);
        }
        return hashMap;
    }

    public final void A0G() {
        C120385ch parseFromJson;
        C120415ck c120415ck;
        try {
            String str = this.A0L;
            if (str != null && (parseFromJson = AbstractC120375cg.parseFromJson(C16V.A00(str))) != null) {
                for (C120425cl c120425cl : parseFromJson.A00) {
                    this.A0Z.put(c120425cl.A01, c120425cl);
                }
                C120425cl c120425cl2 = (C120425cl) this.A0Z.get("genericML");
                if (c120425cl2 != null && (c120415ck = c120425cl2.A00) != null) {
                    this.A04.A00 = c120415ck.A00;
                }
            }
        } catch (IOException e) {
            C0w9.A03("CameraAREffect", AnonymousClass001.A0R("Unable to parse effect manifest json: ", e.getLocalizedMessage()));
        }
    }

    public final boolean A0H() {
        if (this.A0Z.get("avatarSDK") == null) {
            return false;
        }
        return true;
    }

    public final boolean A0I() {
        if (this.A0Z.get("textCaptions") == null) {
            return false;
        }
        return true;
    }

    public final boolean A0J() {
        if (this.A0Z.get("externalMusicSelection") == null) {
            return false;
        }
        return true;
    }

    public final boolean A0K() {
        Map map = this.A0Z;
        if (map.get("audioAmbient") == null && map.get("audioTriggered") == null && map.get(MediaStreamTrack.AUDIO_TRACK_KIND) == null) {
            return false;
        }
        return true;
    }

    public final boolean A0L() {
        if ("25025320".equals(this.A0B) && !this.A0c) {
            return false;
        }
        return true;
    }

    public final boolean A0M() {
        if (!this.A0h && !A0O() && !"INSTAGRAM_CAMERA".equals(this.A0E)) {
            return false;
        }
        return true;
    }

    public final boolean A0N() {
        if (this.A0Z.get("multipeer") != null && this.A0Z.get("multipeer_messaging") != null) {
            return true;
        }
        return false;
    }

    public final boolean A0O() {
        if (!this.A0Y.contains("AVATAR_PRESET")) {
            if (A0H() && this.A0D != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC38391qT
    public final EnumC77213d7 BqJ() {
        if (this.A01 == 1) {
            return EnumC77213d7.A04;
        }
        return EnumC77213d7.A03;
    }

    @Override // X.InterfaceC38391qT
    public final String BqK() {
        String str = this.A0K;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC38391qT
    public final Collection BqL() {
        return Collections.EMPTY_LIST;
    }

    @Override // X.InterfaceC38391qT
    public final Integer BqO() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38391qT
    public final boolean CcN() {
        if (this.A01 == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC38391qT
    public final void Ed3(EnumC77213d7 enumC77213d7) {
        int i = 0;
        if (enumC77213d7 == EnumC77213d7.A04) {
            i = 1;
        }
        this.A01 = i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0J, this.A0M, this.A0K});
    }

    public final String toString() {
        return String.format("name=%s id=%s packageId=%s fileId=%s cacheKey=%s", this.A0S, this.A0K, this.A0M, this.A0J, this.A0G);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0S);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A01);
        parcel.writeStringList(this.A0V);
        parcel.writeStringList(this.A0W);
        parcel.writeByte(this.A0g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0G);
        parcel.writeByte(this.A0e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
    }

    public static String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 4) {
                if (intValue != 1) {
                    return "DEFAULT";
                }
                return "SUPERZOOMV3";
            }
            return "FOCUSV2";
        }
        return "FOCUS";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.8B8, java.lang.Object, X.1vN] */
    @Override // X.InterfaceC38391qT
    public final void AEH(AbstractC12990ll abstractC12990ll) {
        EnumC77213d7 enumC77213d7;
        C25671My A00 = AbstractC25651Mw.A00(abstractC12990ll);
        String str = this.A0K;
        if (this.A01 == 1) {
            enumC77213d7 = EnumC77213d7.A04;
        } else {
            enumC77213d7 = EnumC77213d7.A03;
        }
        ?? obj = new Object();
        obj.A01 = str;
        obj.A00 = enumC77213d7;
        A00.E4s(obj);
    }

    public CameraAREffect(ImageUrl imageUrl, ImageUrl imageUrl2, ImageUrl imageUrl3, ImageUrl imageUrl4, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List list, List list2, List list3, List list4, List list5, List list6, Set set, Set set2, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A0X = Collections.emptyList();
        this.A0b = new HashSet();
        this.A0a = new HashSet();
        this.A09 = C05F.A0N;
        this.A0T = Collections.emptyList();
        this.A04 = new SparkVisionCapability();
        this.A0V = new ArrayList();
        this.A0W = new ArrayList();
        this.A06 = new SimpleImageUrl("");
        this.A0Y = new ArrayList();
        this.A0Z = new HashMap();
        this.A0K = str;
        this.A0M = str2;
        this.A0d = z;
        this.A0g = z2;
        this.A0j = z3;
        this.A0J = str3;
        this.A0G = str4;
        this.A0P = str5;
        this.A0H = str6;
        this.A0S = str7;
        this.A0A = str8;
        this.A0c = z4;
        this.A02 = j;
        this.A03 = j2;
        this.A0U = list;
        this.A07 = imageUrl;
        this.A08 = imageUrl2;
        this.A0X = list2;
        this.A0f = z5;
        this.A0b = set;
        this.A0a = set2;
        this.A0L = str9;
        this.A09 = num;
        A0G();
        this.A0B = str10;
        this.A0C = str11;
        this.A05 = imageUrl3;
        this.A0T = list3;
        this.A01 = i;
        this.A0V = list4;
        this.A0W = list5;
        this.A06 = imageUrl4;
        this.A0I = str12;
        this.A0i = z6;
        this.A00 = i2;
        this.A0e = z7;
        this.A0Y = list6;
        if (this.A0K == null) {
            C0w9.A03("CameraAREffect", "mEffectId is null");
        }
        if (this.A0M == null) {
            C0w9.A03("CameraAREffect", "mEffectPackageId is null");
        }
        if (this.A0J == null) {
            C0w9.A03("CameraAREffect", "mEffectFileId is null");
        }
        if (this.A0G == null) {
            C0w9.A03("CameraAREffect", "mCacheKey is null");
        }
        if (this.A0H == null) {
            C0w9.A03("CameraAREffect", "mCompressionType is null");
        }
        if (this.A0S == null) {
            C0w9.A03("CameraAREffect", "mTitle is null");
        }
        if (this.A0A == null) {
            C0w9.A03("CameraAREffect", "mAssetUrl is null");
        }
        if (this.A07 == null) {
            C0w9.A03("CameraAREffect", "mThumbnailUrl is null");
        }
        this.A0N = str13;
        this.A0O = str14;
        this.A0D = str15;
        this.A0R = str16;
        this.A0F = str17;
        this.A0E = str18;
    }

    public CameraAREffect() {
        this.A0X = Collections.emptyList();
        this.A0b = new HashSet();
        this.A0a = new HashSet();
        this.A09 = C05F.A0N;
        this.A0T = Collections.emptyList();
        this.A04 = new SparkVisionCapability();
        this.A0V = new ArrayList();
        this.A0W = new ArrayList();
        this.A06 = new SimpleImageUrl("");
        this.A0Y = new ArrayList();
        this.A0Z = new HashMap();
    }
}
