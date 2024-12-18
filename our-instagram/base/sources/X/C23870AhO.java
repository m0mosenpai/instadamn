package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.File;
import java.util.Map;

/* renamed from: X.AhO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23870AhO implements InterfaceC58033PoJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C185278Js A01;
    public final /* synthetic */ InterfaceC190038bM A02;
    public final /* synthetic */ InterfaceC190038bM A03;
    public final /* synthetic */ EnumC185288Jt A04;
    public final /* synthetic */ AudioOverlayTrack A05;
    public final /* synthetic */ InterfaceC16600sD A06;

    @Override // X.InterfaceC58033PoJ
    public final void DUI(String str) {
    }

    public C23870AhO(Context context, C185278Js c185278Js, InterfaceC190038bM interfaceC190038bM, InterfaceC190038bM interfaceC190038bM2, EnumC185288Jt enumC185288Jt, AudioOverlayTrack audioOverlayTrack, InterfaceC16600sD interfaceC16600sD) {
        this.A05 = audioOverlayTrack;
        this.A04 = enumC185288Jt;
        this.A01 = c185278Js;
        this.A00 = context;
        this.A03 = interfaceC190038bM;
        this.A02 = interfaceC190038bM2;
        this.A06 = interfaceC16600sD;
    }

    /* JADX WARN: Type inference failed for: r21v0, types: [X.PzK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v1, types: [X.PzK, java.lang.Object] */
    @Override // X.InterfaceC58033PoJ
    public final void DUJ() {
        float f;
        Float f2;
        String str;
        File A05;
        ListenableFuture submit;
        EnumC185288Jt enumC185288Jt;
        String str2;
        File A052;
        MediaEffect mediaEffect;
        ListenableFuture submit2;
        EnumC185288Jt enumC185288Jt2;
        AudioFilterType audioFilterType;
        AudioFilterType audioFilterType2;
        AudioOverlayTrack audioOverlayTrack = this.A05;
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        if (downloadedTrack != null) {
            EnumC185288Jt enumC185288Jt3 = this.A04;
            C185278Js c185278Js = this.A01;
            Context context = this.A00;
            InterfaceC190038bM interfaceC190038bM = this.A03;
            InterfaceC190038bM interfaceC190038bM2 = this.A02;
            InterfaceC16600sD interfaceC16600sD = this.A06;
            if (enumC185288Jt3 != null) {
                f = enumC185288Jt3.A01;
            } else {
                f = 1.0f;
            }
            MediaEffect mediaEffect2 = null;
            if (enumC185288Jt3 != null) {
                f2 = enumC185288Jt3.A05;
            } else {
                f2 = null;
            }
            String str3 = downloadedTrack.A02;
            if (enumC185288Jt3 == null || (audioFilterType2 = enumC185288Jt3.A04) == null || (str = audioFilterType2.name()) == null) {
                str = "UNFILTERED";
            }
            String A0i = AnonymousClass001.A0i("full_", str3, str, '_');
            Map map = C185278Js.A0H;
            String A1A = AbstractC166987dD.A1A(A0i, map);
            if (A1A != null && AbstractC166987dD.A11(A1A).exists()) {
                A05 = AbstractC166987dD.A11(A1A);
            } else {
                A05 = AbstractC13530mf.A05(context);
                C14360o3.A07(A05);
            }
            C30172DRc c30172DRc = new C30172DRc(24, A05, interfaceC16600sD, c185278Js);
            if (A1A != null && AbstractC166987dD.A11(A1A).length() > 0) {
                c30172DRc.invoke(enumC185288Jt3);
                return;
            }
            if (c185278Js.A0B) {
                long j = c185278Js.A01;
                long j2 = c185278Js.A02;
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("preview_");
                String str4 = downloadedTrack.A02;
                A1C.append(str4);
                A1C.append('_');
                if (enumC185288Jt3 == null || (audioFilterType = enumC185288Jt3.A04) == null || (str2 = audioFilterType.name()) == null) {
                    str2 = "UNFILTERED";
                }
                A1C.append(str2);
                A1C.append('_');
                A1C.append(j);
                A1C.append('_');
                A1C.append(j2);
                String obj = A1C.toString();
                String A1A2 = AbstractC166987dD.A1A(obj, map);
                if (A1A2 != null && AbstractC166987dD.A11(A1A2).exists()) {
                    A052 = AbstractC166987dD.A11(A1A2);
                } else {
                    A052 = AbstractC13530mf.A05(context);
                    C14360o3.A07(A052);
                }
                C30172DRc c30172DRc2 = new C30172DRc(25, A052, interfaceC16600sD, c185278Js);
                if (A1A2 != null) {
                    c30172DRc2.invoke(enumC185288Jt3);
                } else {
                    UserSession userSession = c185278Js.A0F;
                    File A11 = AbstractC166987dD.A11(str4);
                    int i = c185278Js.A01;
                    long j3 = i;
                    long j4 = c185278Js.A02;
                    MusicAssetModel musicAssetModel = c185278Js.A07;
                    if (musicAssetModel != null) {
                        long j5 = musicAssetModel.A00 - i;
                        if (j4 > j5) {
                            j4 = j5;
                        }
                        C185308Jw A0E = c185278Js.A0E();
                        if (A0E != null && (enumC185288Jt2 = A0E.A01) != null) {
                            mediaEffect = enumC185288Jt2.A00(context);
                        } else {
                            mediaEffect = null;
                        }
                        WG8 A00 = AbstractC69934Vxz.A00(context, C18950wb.A01, new Object(), mediaEffect, userSession, interfaceC190038bM, A11, A052, f2, f, j3, j4);
                        c185278Js.A04 = A00;
                        if (enumC185288Jt3 == null) {
                            submit2 = C25191Kx.A01;
                        } else {
                            submit2 = c185278Js.A0E.submit(new B1P(3, A00, enumC185288Jt3, audioOverlayTrack));
                        }
                        C14360o3.A07(submit2);
                        c185278Js.A06 = submit2;
                        C2OD.A03(new T8L(A052, c30172DRc2, obj, 3), submit2, C6T2.A01);
                    }
                    C14360o3.A0F("musicAssetModel");
                    throw C00O.createAndThrow();
                }
            }
            UserSession userSession2 = c185278Js.A0F;
            File A112 = AbstractC166987dD.A11(downloadedTrack.A02);
            MusicAssetModel musicAssetModel2 = c185278Js.A07;
            if (musicAssetModel2 != null) {
                long j6 = musicAssetModel2.A00;
                C185308Jw A0E2 = c185278Js.A0E();
                if (A0E2 != null && (enumC185288Jt = A0E2.A01) != null) {
                    mediaEffect2 = enumC185288Jt.A00(context);
                }
                WG8 A002 = AbstractC69934Vxz.A00(context, C18950wb.A01, new Object(), mediaEffect2, userSession2, interfaceC190038bM2, A112, A05, f2, f, 0L, j6);
                c185278Js.A03 = A002;
                if (enumC185288Jt3 == null) {
                    submit = C25191Kx.A01;
                } else {
                    submit = c185278Js.A0E.submit(new B1P(3, A002, enumC185288Jt3, audioOverlayTrack));
                }
                C14360o3.A07(submit);
                c185278Js.A05 = submit;
                C2OD.A03(new T8L(A05, c30172DRc, A0i, 4), submit, C6T2.A01);
                return;
            }
            C14360o3.A0F("musicAssetModel");
            throw C00O.createAndThrow();
        }
    }
}
