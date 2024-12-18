package com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class Closeables {
    public static final Logger logger = Logger.getLogger(Closeables.class.getName());

    public static void A01(InputStream inputStream) {
        try {
            A00(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static void A02(Reader reader) {
        try {
            A00(reader, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static void A00(Closeable closeable, boolean swallowIOException) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (swallowIOException) {
                    logger.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                    return;
                }
                throw e;
            }
        }
    }
}
