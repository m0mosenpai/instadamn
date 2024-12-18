package X;

/* renamed from: X.Lub, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49522Lub implements AnonymousClass876 {
    public final int A00;
    public final Object A01;

    public C49522Lub(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // X.AnonymousClass876
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int BVm() {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L14;
                case 1: goto L1f;
                case 2: goto L26;
                case 3: goto L2d;
                case 4: goto L37;
                case 5: goto L42;
                case 6: goto L49;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.A01
            X.KDC r0 = (X.KDC) r0
            X.0do r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
        L11:
            int r0 = r0.A02
            return r0
        L14:
            java.lang.Object r0 = r2.A01
            X.9fS r0 = (X.C214909fS) r0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r0.A07
            if (r0 != 0) goto L5b
            java.lang.String r0 = "clipsCreationViewModel"
            goto L53
        L1f:
            java.lang.Object r0 = r2.A01
            X.KCv r0 = (X.C45506KCv) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A01
            goto L4f
        L26:
            java.lang.Object r0 = r2.A01
            X.KCp r0 = (X.C45500KCp) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A01
            goto L3d
        L2d:
            java.lang.Object r0 = r2.A01
            X.LuY r0 = (X.C49519LuY) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A02
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L37:
            java.lang.Object r0 = r2.A01
            X.KCq r0 = (X.C45501KCq) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A00
        L3d:
            if (r0 != 0) goto L11
            java.lang.String r0 = "audioTrack"
            goto L53
        L42:
            java.lang.Object r0 = r2.A01
            X.KDB r0 = (X.KDB) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A02
            goto L4f
        L49:
            java.lang.Object r0 = r2.A01
            X.KD1 r0 = (X.KD1) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A00
        L4f:
            if (r0 != 0) goto L11
            java.lang.String r0 = "currentAudioOverlayTrack"
        L53:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L5b:
            int r1 = r0.A0E()
            r0 = 90000(0x15f90, float:1.26117E-40)
            int r0 = java.lang.Math.min(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49522Lub.BVm():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // X.AnonymousClass876
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EZO(int r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L2a;
                case 2: goto L15;
                case 3: goto L5;
                case 4: goto Le;
                case 5: goto L5;
                case 6: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.String r1 = "MusicOnProfileMusicEditorFragment"
            java.lang.String r0 = "Music On Profile format does not support modifying the duration"
            X.C0w9.A03(r1, r0)
            return
        Le:
            java.lang.Object r0 = r3.A01
            X.KCq r0 = (X.C45501KCq) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A00
            goto L1b
        L15:
            java.lang.Object r0 = r3.A01
            X.KCp r0 = (X.C45500KCp) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A01
        L1b:
            if (r0 == 0) goto L20
            r0.A02 = r4
            return
        L20:
            java.lang.String r0 = "audioTrack"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2a:
            java.lang.String r2 = "ClipsMusicMiniEditorFragment"
            goto L2f
        L2d:
            java.lang.String r2 = "ClipsMusicEditorFragment"
        L2f:
            java.lang.String r1 = "The Clips format does not support modifying the duration"
            r0 = 0
            X.AbstractC12120kG.A07(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49522Lub.EZO(int):void");
    }
}
