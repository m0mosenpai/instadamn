package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* renamed from: X.R6e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60541R6e extends C1U7 {
    public final Context A00;

    @Override // X.C1U7
    public final MappedByteBuffer A01() {
        try {
            AssetFileDescriptor openFd = this.A00.getAssets().openFd("strings/default.frsc");
            try {
                FileInputStream createInputStream = openFd.createInputStream();
                try {
                    MappedByteBuffer map = createInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getLength());
                    createInputStream.close();
                    openFd.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw AbstractC58318PtA.A0e("Error loading default.frsc", e);
        }
    }

    public C60541R6e(Context context, C1R8 c1r8, Locale locale) {
        super(context, c1r8, locale);
        this.A00 = context;
    }
}
