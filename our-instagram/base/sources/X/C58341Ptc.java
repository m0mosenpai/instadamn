package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Ptc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58341Ptc {
    public static final Object A08 = AbstractC58318PtA.A0b();
    public static volatile C58341Ptc A09;
    public final InterfaceC65184TfS A02;
    public final InterfaceC65301ThZ A03;
    public final ReadWriteLock A06 = new ReentrantReadWriteLock();
    public volatile int A07 = 3;
    public final Handler A00 = AbstractC167007dF.A0J();
    public final java.util.Set A05 = new C012504o(0);
    public final InterfaceC65185TfT A04 = new Object();
    public final C58342Ptd A01 = new C58342Ptd(this);

    public static C58341Ptc A00() {
        C58341Ptc c58341Ptc;
        synchronized (A08) {
            c58341Ptc = A09;
            boolean z = false;
            if (c58341Ptc != null) {
                z = true;
            }
            C02R.A07(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c58341Ptc;
    }

    public final int A01() {
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.readLock().lock();
        try {
            return this.A07;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:57:0x0065, B:59:0x0069, B:61:0x006d, B:63:0x007c, B:26:0x0093, B:28:0x0097, B:30:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b6, B:42:0x00c3, B:44:0x00c9, B:46:0x00d8, B:25:0x0089), top: B:56:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:57:0x0065, B:59:0x0069, B:61:0x006d, B:63:0x007c, B:26:0x0093, B:28:0x0097, B:30:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b6, B:42:0x00c3, B:44:0x00c9, B:46:0x00d8, B:25:0x0089), top: B:56:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, X.4ya] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, X.4ya] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence A02(java.lang.CharSequence r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58341Ptc.A02(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void A04(AbstractC106884rp abstractC106884rp) {
        C02R.A03(abstractC106884rp, "initCallback cannot be null");
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.writeLock().lock();
        try {
            if (this.A07 != 1 && this.A07 != 2) {
                this.A05.add(abstractC106884rp);
            } else {
                Handler handler = this.A00;
                int i = this.A07;
                C02R.A03(abstractC106884rp, "initCallback cannot be null");
                handler.post(new RunnableC55102gA(null, Arrays.asList(abstractC106884rp), i));
            }
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.TfT, java.lang.Object] */
    public C58341Ptc(InterfaceC65184TfS interfaceC65184TfS, InterfaceC65301ThZ interfaceC65301ThZ) {
        this.A03 = interfaceC65301ThZ;
        this.A02 = interfaceC65184TfS;
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.writeLock().lock();
        AbstractC58318PtA.A1Y(readWriteLock);
        if (A01() == 0) {
            this.A01.A00();
        }
    }

    public final void A03(EditorInfo editorInfo) {
        int i;
        if (A01() == 1 && editorInfo != null) {
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = AbstractC166987dD.A0b();
                editorInfo.extras = bundle;
            }
            C2f4 c2f4 = this.A01.A02.A02;
            int A00 = c2f4.A00(4);
            if (A00 != 0) {
                i = c2f4.A04.getInt(A00 + c2f4.A00);
            } else {
                i = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    public final void A05(Throwable th) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.writeLock().lock();
        try {
            this.A07 = 2;
            java.util.Set set = this.A05;
            A1E.addAll(set);
            set.clear();
            AbstractC58318PtA.A1Y(readWriteLock);
            this.A00.post(new RunnableC55102gA(th, A1E, this.A07));
        } catch (Throwable th2) {
            AbstractC58318PtA.A1Y(readWriteLock);
            throw th2;
        }
    }
}
