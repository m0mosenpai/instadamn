package X;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class SYO {
    public static final Pattern A02 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(Metadata metadata) {
        String str;
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.A01;
            if (i < entryArr.length) {
                Metadata.Entry entry = entryArr[i];
                if (entry instanceof CommentFrame) {
                    CommentFrame commentFrame = (CommentFrame) entry;
                    if ("iTunSMPB".equals(commentFrame.A00)) {
                        str = commentFrame.A02;
                    } else {
                        continue;
                        i++;
                    }
                } else {
                    if (entry instanceof InternalFrame) {
                        InternalFrame internalFrame = (InternalFrame) entry;
                        if ("com.apple.iTunes".equals(internalFrame.A01) && "iTunSMPB".equals(internalFrame.A00)) {
                            str = internalFrame.A02;
                        }
                    } else {
                        continue;
                    }
                    i++;
                }
                Matcher matcher = A02.matcher(str);
                if (matcher.find()) {
                    try {
                        int parseInt = Integer.parseInt(matcher.group(1), 16);
                        int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                        if (parseInt > 0 || parseInt2 > 0) {
                            this.A00 = parseInt;
                            this.A01 = parseInt2;
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
