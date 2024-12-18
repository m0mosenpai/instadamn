package com.fasterxml.jackson.databind.ser.std;

import java.io.File;

/* loaded from: classes2.dex */
public class FileSerializer extends StdScalarSerializer {
    public FileSerializer() {
        super(File.class);
    }
}
