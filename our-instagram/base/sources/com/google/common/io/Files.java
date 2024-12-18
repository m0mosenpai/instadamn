package com.google.common.io;

import X.AbstractC37701p7;
import X.AbstractC60692pt;
import X.AbstractC63327Shb;
import X.C18C;
import X.InterfaceC60722pw;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class Files {
    public static void A00(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create parent directories of ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }
    }

    public static void A01(File from, File to) {
        C18C.A09(from, to, "Source %s and destination %s must be different", !from.equals(to));
        ImmutableSet A04 = ImmutableSet.A04(new FileWriteMode[0]);
        InterfaceC60722pw interfaceC60722pw = AbstractC60692pt.A00;
        ArrayDeque arrayDeque = new ArrayDeque(4);
        try {
            FileInputStream fileInputStream = new FileInputStream(from);
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(to, A04.contains(FileWriteMode.A01));
            arrayDeque.addFirst(fileOutputStream);
            AbstractC37701p7.A00(fileInputStream, fileOutputStream);
            AbstractC60692pt.A00(interfaceC60722pw, null, arrayDeque);
        } catch (Throwable th) {
            try {
                Object obj = AbstractC63327Shb.A00;
                if (!IOException.class.isInstance(th)) {
                    if (!(th instanceof RuntimeException) && !(th instanceof Error)) {
                        throw new RuntimeException(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                AbstractC60692pt.A00(interfaceC60722pw, th, arrayDeque);
                throw th2;
            }
        }
    }

    public static void A02(File from, File to) {
        from.getClass();
        C18C.A09(from, to, "Source %s and destination %s must be different", !from.equals(to));
        if (!from.renameTo(to)) {
            A01(from, to);
            if (!from.delete()) {
                boolean delete = to.delete();
                StringBuilder sb = new StringBuilder();
                if (!delete) {
                    sb.append("Unable to delete ");
                    sb.append(to);
                    throw new IOException(sb.toString());
                }
                sb.append("Unable to delete ");
                sb.append(from);
                throw new IOException(sb.toString());
            }
        }
    }
}
