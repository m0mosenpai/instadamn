package X;

import android.util.LruCache;
import android.util.Pair;
import com.facebook.systrace.Systrace;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;

/* renamed from: X.1Ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23031Ai {
    public static final /* synthetic */ C0YR[] A8c;
    public final UserSession A00;
    public final InterfaceC19630xq A01;
    public final ConcurrentHashMap A02;
    public final InterfaceC16530ry A03;
    public final InterfaceC16530ry A04;
    public final InterfaceC16530ry A05;
    public final InterfaceC16530ry A06;
    public final InterfaceC16530ry A07;
    public final InterfaceC16530ry A08;
    public final InterfaceC16530ry A09;
    public final InterfaceC16530ry A0A;
    public final InterfaceC16530ry A0B;
    public final InterfaceC16530ry A0C;
    public final InterfaceC16530ry A0D;
    public final InterfaceC16530ry A0E;
    public final InterfaceC16530ry A0F;
    public final InterfaceC16530ry A0G;
    public final InterfaceC16530ry A0H;
    public final InterfaceC16530ry A0I;
    public final InterfaceC16530ry A0J;
    public final InterfaceC16530ry A0K;
    public final InterfaceC16530ry A0L;
    public final InterfaceC16530ry A0M;
    public final InterfaceC16530ry A0N;
    public final InterfaceC16530ry A0O;
    public final InterfaceC16530ry A0P;
    public final InterfaceC16530ry A0Q;
    public final InterfaceC16530ry A0R;
    public final InterfaceC16530ry A0S;
    public final InterfaceC16530ry A0T;
    public final InterfaceC16530ry A0U;
    public final InterfaceC16530ry A0V;
    public final InterfaceC16530ry A0W;
    public final InterfaceC16530ry A0X;
    public final InterfaceC16530ry A0Y;
    public final InterfaceC16530ry A0Z;
    public final InterfaceC16530ry A0a;
    public final InterfaceC16530ry A0b;
    public final InterfaceC16530ry A0c;
    public final InterfaceC16530ry A0d;
    public final InterfaceC16530ry A0e;
    public final InterfaceC16530ry A0f;
    public final InterfaceC16530ry A0g;
    public final InterfaceC16530ry A0h;
    public final InterfaceC16530ry A0i;
    public final InterfaceC16530ry A0j;
    public final InterfaceC16530ry A0k;
    public final InterfaceC16530ry A0l;
    public final InterfaceC16530ry A0m;
    public final InterfaceC16530ry A0n;
    public final InterfaceC16530ry A0o;
    public final InterfaceC16530ry A0p;
    public final InterfaceC16530ry A0q;
    public final InterfaceC16530ry A0r;
    public final InterfaceC16530ry A0s;
    public final InterfaceC16530ry A0t;
    public final InterfaceC16530ry A0u;
    public final InterfaceC16530ry A0v;
    public final InterfaceC16530ry A0w;
    public final InterfaceC16530ry A0x;
    public final InterfaceC16530ry A0y;
    public final InterfaceC16530ry A0z;
    public final InterfaceC16530ry A10;
    public final InterfaceC16530ry A11;
    public final InterfaceC16530ry A12;
    public final InterfaceC16530ry A13;
    public final InterfaceC16530ry A14;
    public final InterfaceC16530ry A15;
    public final InterfaceC16530ry A16;
    public final InterfaceC16530ry A17;
    public final InterfaceC16530ry A18;
    public final InterfaceC16530ry A19;
    public final InterfaceC16530ry A1A;
    public final InterfaceC16530ry A1B;
    public final InterfaceC16530ry A1C;
    public final InterfaceC16530ry A1D;
    public final InterfaceC16530ry A1E;
    public final InterfaceC16530ry A1F;
    public final InterfaceC16530ry A1G;
    public final InterfaceC16530ry A1H;
    public final InterfaceC16530ry A1I;
    public final InterfaceC16530ry A1J;
    public final InterfaceC16530ry A1K;
    public final InterfaceC16530ry A1L;
    public final InterfaceC16530ry A1M;
    public final InterfaceC16530ry A1N;
    public final InterfaceC16530ry A1O;
    public final InterfaceC16530ry A1P;
    public final InterfaceC16530ry A1Q;
    public final InterfaceC16530ry A1R;
    public final InterfaceC16530ry A1S;
    public final InterfaceC16530ry A1T;
    public final InterfaceC16530ry A1U;
    public final InterfaceC16530ry A1V;
    public final InterfaceC16530ry A1W;
    public final InterfaceC16530ry A1X;
    public final InterfaceC16530ry A1Y;
    public final InterfaceC16530ry A1Z;
    public final InterfaceC16530ry A1a;
    public final InterfaceC16530ry A1b;
    public final InterfaceC16530ry A1c;
    public final InterfaceC16530ry A1d;
    public final InterfaceC16530ry A1e;
    public final InterfaceC16530ry A1f;
    public final InterfaceC16530ry A1g;
    public final InterfaceC16530ry A1h;
    public final InterfaceC16530ry A1i;
    public final InterfaceC16530ry A1j;
    public final InterfaceC16530ry A1k;
    public final InterfaceC16530ry A1l;
    public final InterfaceC16530ry A1m;
    public final InterfaceC16530ry A1n;
    public final InterfaceC16530ry A1o;
    public final InterfaceC16530ry A1p;
    public final InterfaceC16530ry A1q;
    public final InterfaceC16530ry A1r;
    public final InterfaceC16530ry A1s;
    public final InterfaceC16530ry A1t;
    public final InterfaceC16530ry A1u;
    public final InterfaceC16530ry A1v;
    public final InterfaceC16530ry A1w;
    public final InterfaceC16530ry A1x;
    public final InterfaceC16530ry A1y;
    public final InterfaceC16530ry A1z;
    public final InterfaceC16530ry A20;
    public final InterfaceC16530ry A21;
    public final InterfaceC16530ry A22;
    public final InterfaceC16530ry A23;
    public final InterfaceC16530ry A24;
    public final InterfaceC16530ry A25;
    public final InterfaceC16530ry A26;
    public final InterfaceC16530ry A27;
    public final InterfaceC16530ry A28;
    public final InterfaceC16530ry A29;
    public final InterfaceC16530ry A2A;
    public final InterfaceC16530ry A2B;
    public final InterfaceC16530ry A2C;
    public final InterfaceC16530ry A2D;
    public final InterfaceC16530ry A2E;
    public final InterfaceC16530ry A2F;
    public final InterfaceC16530ry A2G;
    public final InterfaceC16530ry A2H;
    public final InterfaceC16530ry A2I;
    public final InterfaceC16530ry A2J;
    public final InterfaceC16530ry A2K;
    public final InterfaceC16530ry A2L;
    public final InterfaceC16530ry A2M;
    public final InterfaceC16530ry A2N;
    public final InterfaceC16530ry A2O;
    public final InterfaceC16530ry A2P;
    public final InterfaceC16530ry A2Q;
    public final InterfaceC16530ry A2R;
    public final InterfaceC16530ry A2S;
    public final InterfaceC16530ry A2T;
    public final InterfaceC16530ry A2U;
    public final InterfaceC16530ry A2V;
    public final InterfaceC16530ry A2W;
    public final InterfaceC16530ry A2X;
    public final InterfaceC16530ry A2Y;
    public final InterfaceC16530ry A2Z;
    public final InterfaceC16530ry A2a;
    public final InterfaceC16530ry A2b;
    public final InterfaceC16530ry A2c;
    public final InterfaceC16530ry A2d;
    public final InterfaceC16530ry A2e;
    public final InterfaceC16530ry A2f;
    public final InterfaceC16530ry A2g;
    public final InterfaceC16530ry A2h;
    public final InterfaceC16530ry A2i;
    public final InterfaceC16530ry A2j;
    public final InterfaceC16530ry A2k;
    public final InterfaceC16530ry A2l;
    public final InterfaceC16530ry A2m;
    public final InterfaceC16530ry A2n;
    public final InterfaceC16530ry A2o;
    public final InterfaceC16530ry A2p;
    public final InterfaceC16530ry A2q;
    public final InterfaceC16530ry A2r;
    public final InterfaceC16530ry A2s;
    public final InterfaceC16530ry A2t;
    public final InterfaceC16530ry A2u;
    public final InterfaceC16530ry A2v;
    public final InterfaceC16530ry A2w;
    public final InterfaceC16530ry A2x;
    public final InterfaceC16530ry A2y;
    public final InterfaceC16530ry A2z;
    public final InterfaceC16530ry A30;
    public final InterfaceC16530ry A31;
    public final InterfaceC16530ry A32;
    public final InterfaceC16530ry A33;
    public final InterfaceC16530ry A34;
    public final InterfaceC16530ry A35;
    public final InterfaceC16530ry A36;
    public final InterfaceC16530ry A37;
    public final InterfaceC16530ry A38;
    public final InterfaceC16530ry A39;
    public final InterfaceC16530ry A3A;
    public final InterfaceC16530ry A3B;
    public final InterfaceC16530ry A3C;
    public final InterfaceC16530ry A3D;
    public final InterfaceC16530ry A3E;
    public final InterfaceC16530ry A3F;
    public final InterfaceC16530ry A3G;
    public final InterfaceC16530ry A3H;
    public final InterfaceC16530ry A3I;
    public final InterfaceC16530ry A3J;
    public final InterfaceC16530ry A3K;
    public final InterfaceC16530ry A3L;
    public final InterfaceC16530ry A3M;
    public final InterfaceC16530ry A3N;
    public final InterfaceC16530ry A3O;
    public final InterfaceC16530ry A3P;
    public final InterfaceC16530ry A3Q;
    public final InterfaceC16530ry A3R;
    public final InterfaceC16530ry A3S;
    public final InterfaceC16530ry A3T;
    public final InterfaceC16530ry A3U;
    public final InterfaceC16530ry A3V;
    public final InterfaceC16530ry A3W;
    public final InterfaceC16530ry A3X;
    public final InterfaceC16530ry A3Y;
    public final InterfaceC16530ry A3Z;
    public final InterfaceC16530ry A3a;
    public final InterfaceC16530ry A3b;
    public final InterfaceC16530ry A3c;
    public final InterfaceC16530ry A3d;
    public final InterfaceC16530ry A3e;
    public final InterfaceC16530ry A3f;
    public final InterfaceC16530ry A3g;
    public final InterfaceC16530ry A3h;
    public final InterfaceC16530ry A3i;
    public final InterfaceC16530ry A3j;
    public final InterfaceC16530ry A3k;
    public final InterfaceC16530ry A3l;
    public final InterfaceC16530ry A3m;
    public final InterfaceC16530ry A3n;
    public final InterfaceC16530ry A3o;
    public final InterfaceC16530ry A3p;
    public final InterfaceC16530ry A3q;
    public final InterfaceC16530ry A3r;
    public final InterfaceC16530ry A3s;
    public final InterfaceC16530ry A3t;
    public final InterfaceC16530ry A3u;
    public final InterfaceC16530ry A3v;
    public final InterfaceC16530ry A3w;
    public final InterfaceC16530ry A3x;
    public final InterfaceC16530ry A3y;
    public final InterfaceC16530ry A3z;
    public final InterfaceC16530ry A40;
    public final InterfaceC16530ry A41;
    public final InterfaceC16530ry A42;
    public final InterfaceC16530ry A43;
    public final InterfaceC16530ry A44;
    public final InterfaceC16530ry A45;
    public final InterfaceC16530ry A46;
    public final InterfaceC16530ry A47;
    public final InterfaceC16530ry A48;
    public final InterfaceC16530ry A49;
    public final InterfaceC16530ry A4A;
    public final InterfaceC16530ry A4B;
    public final InterfaceC16530ry A4C;
    public final InterfaceC16530ry A4D;
    public final InterfaceC16530ry A4E;
    public final InterfaceC16530ry A4F;
    public final InterfaceC16530ry A4G;
    public final InterfaceC16530ry A4H;
    public final InterfaceC16530ry A4I;
    public final InterfaceC16530ry A4J;
    public final InterfaceC16530ry A4K;
    public final InterfaceC16530ry A4L;
    public final InterfaceC16530ry A4M;
    public final InterfaceC16530ry A4N;
    public final InterfaceC16530ry A4O;
    public final InterfaceC16530ry A4P;
    public final InterfaceC16530ry A4Q;
    public final InterfaceC16530ry A4R;
    public final InterfaceC16530ry A4S;
    public final InterfaceC16530ry A4T;
    public final InterfaceC16530ry A4U;
    public final InterfaceC16530ry A4V;
    public final InterfaceC16530ry A4W;
    public final InterfaceC16530ry A4X;
    public final InterfaceC16530ry A4Y;
    public final InterfaceC16530ry A4Z;
    public final InterfaceC16530ry A4a;
    public final InterfaceC16530ry A4b;
    public final InterfaceC16530ry A4c;
    public final InterfaceC16530ry A4d;
    public final InterfaceC16530ry A4e;
    public final InterfaceC16530ry A4f;
    public final InterfaceC16530ry A4g;
    public final InterfaceC16530ry A4h;
    public final InterfaceC16530ry A4i;
    public final InterfaceC16530ry A4j;
    public final InterfaceC16530ry A4k;
    public final InterfaceC16530ry A4l;
    public final InterfaceC16530ry A4m;
    public final InterfaceC16530ry A4n;
    public final InterfaceC16530ry A4o;
    public final InterfaceC16530ry A4p;
    public final InterfaceC16530ry A4q;
    public final InterfaceC16530ry A4r;
    public final InterfaceC16530ry A4s;
    public final InterfaceC16530ry A4t;
    public final InterfaceC16530ry A4u;
    public final InterfaceC16530ry A4v;
    public final InterfaceC16530ry A4w;
    public final InterfaceC16530ry A4x;
    public final InterfaceC16530ry A4y;
    public final InterfaceC16530ry A4z;
    public final InterfaceC16530ry A50;
    public final InterfaceC16530ry A51;
    public final InterfaceC16530ry A52;
    public final InterfaceC16530ry A53;
    public final InterfaceC16530ry A54;
    public final InterfaceC16530ry A55;
    public final InterfaceC16530ry A56;
    public final InterfaceC16530ry A57;
    public final InterfaceC16530ry A58;
    public final InterfaceC16530ry A59;
    public final InterfaceC16530ry A5A;
    public final InterfaceC16530ry A5B;
    public final InterfaceC16530ry A5C;
    public final InterfaceC16530ry A5D;
    public final InterfaceC16530ry A5E;
    public final InterfaceC16530ry A5F;
    public final InterfaceC16530ry A5G;
    public final InterfaceC16530ry A5H;
    public final InterfaceC16530ry A5I;
    public final InterfaceC16530ry A5J;
    public final InterfaceC16530ry A5K;
    public final InterfaceC16530ry A5L;
    public final InterfaceC16530ry A5M;
    public final InterfaceC16530ry A5N;
    public final InterfaceC16530ry A5O;
    public final InterfaceC16530ry A5P;
    public final InterfaceC16530ry A5Q;
    public final InterfaceC16530ry A5R;
    public final InterfaceC16530ry A5S;
    public final InterfaceC16530ry A5T;
    public final InterfaceC16530ry A5U;
    public final InterfaceC16530ry A5V;
    public final InterfaceC16530ry A5W;
    public final InterfaceC16530ry A5X;
    public final InterfaceC16530ry A5Y;
    public final InterfaceC16530ry A5Z;
    public final InterfaceC16530ry A5a;
    public final InterfaceC16530ry A5b;
    public final InterfaceC16530ry A5c;
    public final InterfaceC16530ry A5d;
    public final InterfaceC16530ry A5e;
    public final InterfaceC16530ry A5f;
    public final InterfaceC16530ry A5g;
    public final InterfaceC16530ry A5h;
    public final InterfaceC16530ry A5i;
    public final InterfaceC16530ry A5j;
    public final InterfaceC16530ry A5k;
    public final InterfaceC16530ry A5l;
    public final InterfaceC16530ry A5m;
    public final InterfaceC16530ry A5n;
    public final InterfaceC16530ry A5o;
    public final InterfaceC16530ry A5p;
    public final InterfaceC16530ry A5q;
    public final InterfaceC16530ry A5r;
    public final InterfaceC16530ry A5s;
    public final InterfaceC16530ry A5t;
    public final InterfaceC16530ry A5u;
    public final InterfaceC16530ry A5v;
    public final InterfaceC16530ry A5w;
    public final InterfaceC16530ry A5x;
    public final InterfaceC16530ry A5y;
    public final InterfaceC16530ry A5z;
    public final InterfaceC16530ry A60;
    public final InterfaceC16530ry A61;
    public final InterfaceC16530ry A62;
    public final InterfaceC16530ry A63;
    public final InterfaceC16530ry A64;
    public final InterfaceC16530ry A65;
    public final InterfaceC16530ry A66;
    public final InterfaceC16530ry A67;
    public final InterfaceC16530ry A68;
    public final InterfaceC16530ry A69;
    public final InterfaceC16530ry A6A;
    public final InterfaceC16530ry A6B;
    public final InterfaceC16530ry A6C;
    public final InterfaceC16530ry A6D;
    public final InterfaceC16530ry A6E;
    public final InterfaceC16530ry A6F;
    public final InterfaceC16530ry A6G;
    public final InterfaceC16530ry A6H;
    public final InterfaceC16530ry A6I;
    public final InterfaceC16530ry A6J;
    public final InterfaceC16530ry A6K;
    public final InterfaceC16530ry A6L;
    public final InterfaceC16530ry A6M;
    public final InterfaceC16530ry A6N;
    public final InterfaceC16530ry A6O;
    public final InterfaceC16530ry A6P;
    public final InterfaceC16530ry A6Q;
    public final InterfaceC16530ry A6R;
    public final InterfaceC16530ry A6S;
    public final InterfaceC16530ry A6T;
    public final InterfaceC16530ry A6U;
    public final InterfaceC16530ry A6V;
    public final InterfaceC16530ry A6W;
    public final InterfaceC16530ry A6X;
    public final InterfaceC16530ry A6Y;
    public final InterfaceC16530ry A6Z;
    public final InterfaceC16530ry A6a;
    public final InterfaceC16530ry A6b;
    public final InterfaceC16530ry A6c;
    public final InterfaceC16530ry A6d;
    public final InterfaceC16530ry A6e;
    public final InterfaceC16530ry A6f;
    public final InterfaceC16530ry A6g;
    public final InterfaceC16530ry A6h;
    public final InterfaceC16530ry A6i;
    public final InterfaceC16530ry A6j;
    public final InterfaceC16530ry A6k;
    public final InterfaceC16530ry A6l;
    public final InterfaceC16530ry A6m;
    public final InterfaceC16530ry A6n;
    public final InterfaceC16530ry A6o;
    public final InterfaceC16530ry A6p;
    public final InterfaceC16530ry A6q;
    public final InterfaceC16530ry A6r;
    public final InterfaceC16530ry A6s;
    public final InterfaceC16530ry A6t;
    public final InterfaceC16530ry A6u;
    public final InterfaceC16530ry A6v;
    public final InterfaceC16530ry A6w;
    public final InterfaceC16530ry A6x;
    public final InterfaceC16530ry A6y;
    public final InterfaceC16530ry A6z;
    public final InterfaceC16530ry A70;
    public final InterfaceC16530ry A71;
    public final InterfaceC16530ry A72;
    public final InterfaceC16530ry A73;
    public final InterfaceC16530ry A74;
    public final InterfaceC16530ry A75;
    public final InterfaceC16530ry A76;
    public final InterfaceC16530ry A77;
    public final InterfaceC16530ry A78;
    public final InterfaceC16530ry A79;
    public final InterfaceC16530ry A7A;
    public final InterfaceC16530ry A7B;
    public final InterfaceC16530ry A7C;
    public final InterfaceC16530ry A7D;
    public final InterfaceC16530ry A7E;
    public final InterfaceC16530ry A7F;
    public final InterfaceC16530ry A7G;
    public final InterfaceC16530ry A7H;
    public final InterfaceC16530ry A7I;
    public final InterfaceC16530ry A7J;
    public final InterfaceC16530ry A7K;
    public final InterfaceC16530ry A7L;
    public final InterfaceC16530ry A7M;
    public final InterfaceC16530ry A7N;
    public final InterfaceC16530ry A7O;
    public final InterfaceC16530ry A7P;
    public final InterfaceC16530ry A7Q;
    public final InterfaceC16530ry A7R;
    public final InterfaceC16530ry A7S;
    public final InterfaceC16530ry A7T;
    public final InterfaceC16530ry A7U;
    public final InterfaceC16530ry A7V;
    public final InterfaceC16530ry A7W;
    public final InterfaceC16530ry A7X;
    public final InterfaceC16530ry A7Y;
    public final InterfaceC16530ry A7Z;
    public final InterfaceC16530ry A7a;
    public final InterfaceC16530ry A7b;
    public final InterfaceC16530ry A7c;
    public final InterfaceC16530ry A7d;
    public final InterfaceC16530ry A7e;
    public final InterfaceC16530ry A7f;
    public final InterfaceC16530ry A7g;
    public final InterfaceC16530ry A7h;
    public final InterfaceC16530ry A7i;
    public final InterfaceC16530ry A7j;
    public final InterfaceC16530ry A7k;
    public final InterfaceC16530ry A7l;
    public final InterfaceC16530ry A7m;
    public final InterfaceC16530ry A7n;
    public final InterfaceC16530ry A7o;
    public final InterfaceC16530ry A7p;
    public final InterfaceC16530ry A7q;
    public final InterfaceC16530ry A7r;
    public final InterfaceC16530ry A7s;
    public final InterfaceC16530ry A7t;
    public final InterfaceC16530ry A7u;
    public final InterfaceC16530ry A7v;
    public final InterfaceC16530ry A7w;
    public final InterfaceC16530ry A7x;
    public final InterfaceC16530ry A7y;
    public final InterfaceC16530ry A7z;
    public final InterfaceC16530ry A80;
    public final InterfaceC16530ry A81;
    public final InterfaceC16530ry A82;
    public final InterfaceC16530ry A83;
    public final InterfaceC16530ry A84;
    public final InterfaceC16530ry A85;
    public final InterfaceC16530ry A86;
    public final InterfaceC16530ry A87;
    public final InterfaceC16530ry A88;
    public final InterfaceC16530ry A89;
    public final InterfaceC16530ry A8A;
    public final InterfaceC16530ry A8B;
    public final InterfaceC16530ry A8C;
    public final InterfaceC16530ry A8D;
    public final InterfaceC16530ry A8E;
    public final InterfaceC16530ry A8F;
    public final InterfaceC16530ry A8G;
    public final InterfaceC16530ry A8H;
    public final InterfaceC16530ry A8I;
    public final InterfaceC16530ry A8J;
    public final InterfaceC16530ry A8K;
    public final InterfaceC16530ry A8L;
    public final InterfaceC16530ry A8M;
    public final InterfaceC16530ry A8N;
    public final InterfaceC16530ry A8O;
    public final InterfaceC16530ry A8P;
    public final InterfaceC16530ry A8Q;
    public final InterfaceC16530ry A8R;
    public final InterfaceC16530ry A8S;
    public final InterfaceC16530ry A8T;
    public final InterfaceC16530ry A8U;
    public final InterfaceC16530ry A8V;
    public final InterfaceC16530ry A8W;
    public final InterfaceC16530ry A8X;
    public final InterfaceC16530ry A8Y;
    public final InterfaceC16530ry A8Z;
    public final InterfaceC16530ry A8a;
    public final InterfaceC16530ry A8b;

    public final void A0M() {
        this.A0i.Egi(this, true, A8c[283]);
    }

    public final void A0N() {
        this.A2W.Egi(this, true, A8c[382]);
    }

    public final void A0O() {
        this.A42.Egi(this, true, A8c[142]);
    }

    public final void A0P() {
        this.A5K.Egi(this, true, A8c[414]);
    }

    public final void A0Q() {
        this.A5k.Egi(this, false, A8c[374]);
    }

    @Deprecated(message = "")
    public final void A0S() {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77("should_force_effect_metadata_request", true);
        ARD.apply();
    }

    public final void A0p(UserSession userSession) {
        InterfaceC19610xo ARD;
        String str;
        C14360o3.A0B(userSession, 0);
        int ordinal = AbstractC08690cX.A01(userSession).ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                ARD = this.A01.ARD();
                str = "creator_account_fb_destination_backfilling_completed";
            } else {
                return;
            }
        } else {
            ARD = this.A01.ARD();
            str = "personal_account_fb_page_id_backfilling_completed";
        }
        ARD.E77(str, true);
        ARD.apply();
    }

    public final void A0q(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.EEj(str);
        ARD.apply();
    }

    public final void A0v(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77(AnonymousClass001.A0R("broadcast_channel_tap_for_more_info_in_thread_header/", str), true);
        ARD.apply();
    }

    public final void A0x(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77(AnonymousClass001.A0R("proactive_warning_banner_dismissed/userid/", str), true);
        ARD.apply();
    }

    public final void A10(String str, int i) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D(AnonymousClass001.A0R("bloks_shown_count_", str), i);
        ARD.apply();
    }

    public final void A14(String str, boolean z) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77(AnonymousClass001.A0R(str, "_limit_location_enabled"), z);
        ARD.apply();
    }

    public final void A15(String str, boolean z, boolean z2, boolean z3) {
        InterfaceC19610xo ARD;
        C14360o3.A0B(str, 0);
        InterfaceC19630xq interfaceC19630xq = this.A01;
        boolean equals = str.equals(interfaceC19630xq.getString("clips_auto_saved_draft_ID", ""));
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        if (!equals) {
            ARD2.E7K("clips_auto_saved_draft_ID", str);
            ARD2.apply();
            InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
            ARD3.E77("clips_auto_saved_draft_notif_schedule_status", false);
            ARD3.apply();
            ARD = interfaceC19630xq.ARD();
            ARD.E7D("clips_auto_saved_draft_notif_schedule_attempt_count", 1);
        } else {
            ARD2.E77("clips_auto_saved_draft_notif_schedule_status", z);
            ARD2.apply();
            if (z3) {
                ARD = interfaceC19630xq.ARD();
                ARD.E7D("clips_auto_saved_draft_notif_schedule_attempt_count", 0);
            } else {
                if (!z2) {
                    return;
                }
                int i = interfaceC19630xq.getInt("clips_auto_saved_draft_notif_schedule_attempt_count", 0);
                ARD = interfaceC19630xq.ARD();
                ARD.E7D("clips_auto_saved_draft_notif_schedule_attempt_count", i + 1);
            }
        }
        ARD.apply();
    }

    public final void A19(java.util.Set set) {
        C14360o3.A0B(set, 0);
        InterfaceC19630xq interfaceC19630xq = this.A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.EEj("direct_reels_watched_set");
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7L("direct_reels_watched_set", set);
        ARD2.apply();
    }

    public final boolean A23(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return this.A01.getBoolean("in_call_settings_hd_video", C18U.A06(C06090Tz.A06, userSession, 36325772532987238L));
    }

    public final boolean A24(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return this.A01.getBoolean("in_call_settings_noise_suppression", C18U.A06(C06090Tz.A05, userSession, 36325772532921701L));
    }

    public final boolean A25(String str) {
        return this.A01.getBoolean(AnonymousClass001.A0R(str, "_limit_location_enabled"), false);
    }

    public final boolean A26(String str, String str2) {
        C14360o3.A0B(str2, 1);
        InterfaceC19630xq interfaceC19630xq = this.A01;
        boolean z = interfaceC19630xq.getBoolean(AnonymousClass001.A0R("proactive_warning_banner_dismissed/", str), false);
        boolean z2 = interfaceC19630xq.getBoolean(AnonymousClass001.A0R("proactive_warning_banner_dismissed/userid/", str2), false);
        if (z) {
            if (!z2) {
                A0x(str2);
            }
        } else if (!z2) {
            return false;
        }
        return true;
    }

    static {
        C0YR[] c0yrArr = new C0YR[531];
        System.arraycopy(new C0YR[]{new AnonymousClass019(C23031Ai.class, "hasSeenDisappearingMessagesBottomSheetNux", "getHasSeenDisappearingMessagesBottomSheetNux()Z", 0), new AnonymousClass013(C23031Ai.class, "disappearingMessagesLatestNuxContentSeenVersion", "getDisappearingMessagesLatestNuxContentSeenVersion()J", 0), new AnonymousClass013(C23031Ai.class, "disappearingMessagesUserDeviceHasReceivedE2eeAttribution", "getDisappearingMessagesUserDeviceHasReceivedE2eeAttribution()Z", 0), new AnonymousClass013(C23031Ai.class, "blacklistSearchIds", "getBlacklistSearchIds()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentNotificationReceivedTimestampUnixTime", "getRecentNotificationReceivedTimestampUnixTime()J", 0), new AnonymousClass013(C23031Ai.class, "recentItemsLastSyncedTimestampsMs", "getRecentItemsLastSyncedTimestampsMs()J", 0), new AnonymousClass013(C23031Ai.class, "shoppingRecentItemsLastSyncedTimestampsMs", "getShoppingRecentItemsLastSyncedTimestampsMs()J", 0), new AnonymousClass013(C23031Ai.class, "mapRecentItemsLastSyncedTimestampsMs", "getMapRecentItemsLastSyncedTimestampsMs()J", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedUsers", "getRecentlySearchedUsers()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedUsersWithTimestamp", "getRecentlySearchedUsersWithTimestamp()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlyTaggedUsers", "getRecentlyTaggedUsers()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedHashtagsWithTimestamp", "getRecentlySearchedHashtagsWithTimestamp()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedPlaces", "getRecentlySearchedPlaces()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedKeywordsWithTimestamp", "getRecentlySearchedKeywordsWithTimestamp()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedAudiosWithTimestamp", "getRecentlySearchedAudiosWithTimestamp()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedEffectQueries", "getRecentlySearchedEffectQueries()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedMapPlacesWithTimestamp", "getRecentlySearchedMapPlacesWithTimestamp()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedMapHashtagsWithTimestamp", "getRecentlySearchedMapHashtagsWithTimestamp()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "recentlySearchedMapQueriesWithTimestamp", "getRecentlySearchedMapQueriesWithTimestamp()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenLayoutV2Nux", "getHasSeenLayoutV2Nux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenLongerClipsNux", "getHasSeenLongerClipsNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasConfirmedTifuALikeNux", "getHasConfirmedTifuALikeNux()Z", 0), new AnonymousClass013(C23031Ai.class, "fetaUpgradeStatus", "getFetaUpgradeStatus()I", 0), new AnonymousClass013(C23031Ai.class, "fetaUpgradeStatusTimestamp", "getFetaUpgradeStatusTimestamp()J", 0), new AnonymousClass013(C23031Ai.class, "clipsDraftNotificationDraftID", "getClipsDraftNotificationDraftID()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "flashStatus", "getFlashStatus()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenReelsMultitouchNux", "getHasSeenReelsMultitouchNux()Z", 0)}, 0, c0yrArr, 0, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenNineSixteenTooltip", "getHasSeenNineSixteenTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "shouldGenerateCaptionsForVideo", "getShouldGenerateCaptionsForVideo()Z", 0), new AnonymousClass013(C23031Ai.class, "shouldGenerateCaptionsForStoryVideos", "getShouldGenerateCaptionsForStoryVideos()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAutoTranslatedDisclaimer", "getHasSeenAutoTranslatedDisclaimer()Z", 0), new AnonymousClass013(C23031Ai.class, "shouldSaveCapturedVideos", "getShouldSaveCapturedVideos()Z", 0), new AnonymousClass013(C23031Ai.class, "saveOriginalPosts", "getSaveOriginalPosts()Z", 0), new AnonymousClass013(C23031Ai.class, "savePostedPhotos", "getSavePostedPhotos()Z", 0), new AnonymousClass013(C23031Ai.class, "renderGallery", "getRenderGallery()Z", 0), new AnonymousClass013(C23031Ai.class, "renderBlurIcons", "getRenderBlurIcons()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenReNuxExperience", "getHasSeenReNuxExperience()Z", 0), new AnonymousClass013(C23031Ai.class, "shouldDefaultToReels", "getShouldDefaultToReels()Z", 0), new AnonymousClass013(C23031Ai.class, "isRageShakeEnabledNewFlow", "isRageShakeEnabledNewFlow()Z", 0), new AnonymousClass013(C23031Ai.class, "casperTargetEventTimestamps", "getCasperTargetEventTimestamps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "casperPendingTriggerEventTimestamps", "getCasperPendingTriggerEventTimestamps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "signalsClipsSessionsTimestamps", "getSignalsClipsSessionsTimestamps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "signalsClipsCommentsOpenTimestamps", "getSignalsClipsCommentsOpenTimestamps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "signalsClipsTabOpenTimestamps", "getSignalsClipsTabOpenTimestamps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "signalsExploreSessionsTimestamps", "getSignalsExploreSessionsTimestamps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "signalsClipsAudioPageOpenTimestamps", "getSignalsClipsAudioPageOpenTimestamps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "btpPredictedTimestampsForStory", "getBtpPredictedTimestampsForStory()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "btpPredictedTimestampsForFeed", "getBtpPredictedTimestampsForFeed()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "surfaceUsageRecord", "getSurfaceUsageRecord()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenLowLightNuxTooltip", "getHasSeenLowLightNuxTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNuxForCreation", "getHasSeenNuxForCreation()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNuxForParticipation", "getHasSeenNuxForParticipation()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenTryItNuxForMagicMediaRemix", "getHasSeenTryItNuxForMagicMediaRemix()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCameraConsentNuxForMagicMediaRemix", "getHasSeenCameraConsentNuxForMagicMediaRemix()Z", 0)}, 0, c0yrArr, 27, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenAcknowledgementNuxForMagicMediaRemix", "getHasSeenAcknowledgementNuxForMagicMediaRemix()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFullAccessSettingsNuxForMagicMediaRemix", "getHasSeenFullAccessSettingsNuxForMagicMediaRemix()Z", 0), new AnonymousClass013(C23031Ai.class, "magicMediaRemixNotNowClicked", "getMagicMediaRemixNotNowClicked()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenTextEmphasisOutlinesNuxForReels", "getHasSeenTextEmphasisOutlinesNuxForReels()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenTextEmphasisOutlinesNuxForStories", "getHasSeenTextEmphasisOutlinesNuxForStories()Z", 0), new AnonymousClass013(C23031Ai.class, "newFontsBadgeShowCount", "getNewFontsBadgeShowCount()I", 0), new AnonymousClass013(C23031Ai.class, "textModeFormatId", "getTextModeFormatId()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "textEmphasisMode", "getTextEmphasisMode()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "textColourId", "getTextColourId()I", 0), new AnonymousClass013(C23031Ai.class, "textSizeRatio", "getTextSizeRatio()F", 0), new AnonymousClass013(C23031Ai.class, "allowStoryReshare", "getAllowStoryReshare()Z", 0), new AnonymousClass013(C23031Ai.class, "seenStateJson", "getSeenStateJson()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "perMediaSeenStateJson", "getPerMediaSeenStateJson()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "nonDirectFrontCamera", "getNonDirectFrontCamera()Z", 0), new AnonymousClass013(C23031Ai.class, "directFrontCamera", "getDirectFrontCamera()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenInteractiveStickerUpsellTooltip", "getHasSeenInteractiveStickerUpsellTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "isAppUpdatesEnabled", "isAppUpdatesEnabled()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOfflineLikeNux", "getHasSeenOfflineLikeNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenShareButtonReenabledNux", "getHasSeenShareButtonReenabledNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFeedQuickSendNux", "getHasSeenFeedQuickSendNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAiRewriteTooltip", "getHasSeenAiRewriteTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAiFilterTooltip", "getHasSeenAiFilterTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAiRewriteNux", "getHasSeenAiRewriteNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMemuToolTip", "getHasSeenMemuToolTip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenImagineStickerTrayDiscardMediaDialog", "getHasSeenImagineStickerTrayDiscardMediaDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsQuickSendNux", "getHasSeenClipsQuickSendNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAddToProfileNux", "getHasSeenAddToProfileNux()Z", 0)}, 0, c0yrArr, 54, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenAlsoShareToNux", "getHasSeenAlsoShareToNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOverflowMenuAlsoShareToNux", "getHasSeenOverflowMenuAlsoShareToNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFeedQuickSendWindow", "getHasSeenFeedQuickSendWindow()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsQuickSendWindow", "getHasSeenClipsQuickSendWindow()Z", 0), new AnonymousClass013(C23031Ai.class, "userHasDoubleTappedToLikeComment", "getUserHasDoubleTappedToLikeComment()Z", 0), new AnonymousClass013(C23031Ai.class, "hasDoneLongPressOnCommentAction", "getHasDoneLongPressOnCommentAction()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOpenCarouselCreatorEducationNuxSheet", "getHasSeenOpenCarouselCreatorEducationNuxSheet()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOpenCarouselSubmitterEducationNuxSheet", "getHasSeenOpenCarouselSubmitterEducationNuxSheet()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOpenCarouselApprovalNuxSheet", "getHasSeenOpenCarouselApprovalNuxSheet()Z", 0), new AnonymousClass013(C23031Ai.class, "openCarouselTurnOnCTABannerSeenCount", "getOpenCarouselTurnOnCTABannerSeenCount()I", 0), new AnonymousClass013(C23031Ai.class, "openCarouselTurnOnCTABannerLastSeenMS", "getOpenCarouselTurnOnCTABannerLastSeenMS()J", 0), new AnonymousClass013(C23031Ai.class, "openCarouselTurnOnMenuNewBadgeSeenCount", "getOpenCarouselTurnOnMenuNewBadgeSeenCount()I", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOpenCarouselThankNux", "getHasSeenOpenCarouselThankNux()Z", 0), new AnonymousClass013(C23031Ai.class, "collaboratorsBottomSheetNuxSeenCount", "getCollaboratorsBottomSheetNuxSeenCount()I", 0), new AnonymousClass013(C23031Ai.class, "collabConsumptionEducationBottomSheetBannerDismissed", "getCollabConsumptionEducationBottomSheetBannerDismissed()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOfflineCommentNux", "getHasSeenOfflineCommentNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCommentReplySurfaceNux", "getHasSeenCommentReplySurfaceNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOfflineFollowNux", "getHasSeenOfflineFollowNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasEnabledNametagBackgroundBlur", "getHasEnabledNametagBackgroundBlur()Z", 0), new AnonymousClass013(C23031Ai.class, "hasEnabledNametagBackgroundImageDownload", "getHasEnabledNametagBackgroundImageDownload()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNametag", "getHasSeenNametag()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNametagNuxTutorial", "getHasSeenNametagNuxTutorial()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNametagStoryCameraNux", "getHasSeenNametagStoryCameraNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNametagSelfieCameraNux", "getHasSeenNametagSelfieCameraNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFilterButtonNux", "getHasSeenFilterButtonNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFilterWithLabelButtonNux", "getHasSeenFilterWithLabelButtonNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenExpiringMediaInThreadTooltip", "getHasSeenExpiringMediaInThreadTooltip()Z", 0)}, 0, c0yrArr, 81, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenNewsFeedHideStoryTooltip", "getHasSeenNewsFeedHideStoryTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNewsfeedHideStoryDialog", "getHasSeenNewsfeedHideStoryDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPromoteNewUserTooltip", "getHasSeenPromoteNewUserTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAggregatedPromoteEngagementNux", "getHasSeenAggregatedPromoteEngagementNux()Z", 0), new AnonymousClass013(C23031Ai.class, "liveHasSeenCloseFriendsTooltipWhenSelectedFromAudienceBottomsheet", "getLiveHasSeenCloseFriendsTooltipWhenSelectedFromAudienceBottomsheet()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMessageExtensionTooltip", "getHasSeenMessageExtensionTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCTXMDTooltip", "getHasSeenCTXMDTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "liveHasEnabledTriviaBefore", "getLiveHasEnabledTriviaBefore()Z", 0), new AnonymousClass013(C23031Ai.class, "liveHasEnabledThisOrThatBefore", "getLiveHasEnabledThisOrThatBefore()Z", 0), new AnonymousClass013(C23031Ai.class, "liveHasEnabledCloseUpBefore", "getLiveHasEnabledCloseUpBefore()Z", 0), new AnonymousClass013(C23031Ai.class, "liveHasSeenCloseFriendsViewerPrivacyDisclosure", "getLiveHasSeenCloseFriendsViewerPrivacyDisclosure()Z", 0), new AnonymousClass013(C23031Ai.class, "liveViewerPictureInPictureShouldShowOptInDialog", "getLiveViewerPictureInPictureShouldShowOptInDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "liveViewerPictureInPictureShouldShowToggleToolTip", "getLiveViewerPictureInPictureShouldShowToggleToolTip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedOnLiveMediaPicker", "getHasTappedOnLiveMediaPicker()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSUPUseGlassesToolTip", "getHasSeenSUPUseGlassesToolTip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSUPPrivacyBottomSheet", "getHasSeenSUPPrivacyBottomSheet()Z", 0), new AnonymousClass013(C23031Ai.class, "hasDeniedSUPPermission", "getHasDeniedSUPPermission()Z", 0), new AnonymousClass013(C23031Ai.class, "hasDeniedSUPToolkitPermission", "getHasDeniedSUPToolkitPermission()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSUPDoublePressPromptOnConnected", "getHasSeenSUPDoublePressPromptOnConnected()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSaveReelTooltip", "getHasSeenSaveReelTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMultiAuthorStoryViewCountNux", "getHasSeenMultiAuthorStoryViewCountNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPicsPleaseExtendedDisclaimer", "getHasSeenPicsPleaseExtendedDisclaimer()Z", 0), new AnonymousClass013(C23031Ai.class, "autoSaveReelMediaToGallery", "getAutoSaveReelMediaToGallery()Z", 0), new AnonymousClass013(C23031Ai.class, "autoSaveClipsMediaToGallery", "getAutoSaveClipsMediaToGallery()Z", 0), new AnonymousClass013(C23031Ai.class, "facebookStorySharingPreferenceEnabled", "getFacebookStorySharingPreferenceEnabled()Z", 0), new AnonymousClass013(C23031Ai.class, "musicPickTemplateNewStickerTimeStampInMillis", "getMusicPickTemplateNewStickerTimeStampInMillis()J", 0), new AnonymousClass013(C23031Ai.class, "hasCreatorSeenMessagingNux", "getHasCreatorSeenMessagingNux()Z", 0)}, 0, c0yrArr, 108, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "canUseBrandedContent", "getCanUseBrandedContent()Z", 0), new AnonymousClass013(C23031Ai.class, "partnerProgramOnboardingNextSteps", "getPartnerProgramOnboardingNextSteps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "userPayOnboardingNextSteps", "getUserPayOnboardingNextSteps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "affiliateOnboardingNextSteps", "getAffiliateOnboardingNextSteps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "brandedContentEligibility", "getBrandedContentEligibility()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "igtvRevshareNextSteps", "getIgtvRevshareNextSteps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "showBusinessWelcomeDialog", "getShowBusinessWelcomeDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMyWeekConsumptionNux", "getHasSeenMyWeekConsumptionNux()Z", 0), new AnonymousClass013(C23031Ai.class, "showRecyclingBinDialog", "getShowRecyclingBinDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "businessShowStoriesInsights", "getBusinessShowStoriesInsights()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenProfileIXCtaNux", "getHasSeenProfileIXCtaNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoryBrandedContentTaggingUpsellTooltip", "getHasSeenStoryBrandedContentTaggingUpsellTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenBrandedContentInsightsDisclosureDialog", "getHasSeenBrandedContentInsightsDisclosureDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "showBookOptionSpinner", "getShowBookOptionSpinner()Z", 0), new AnonymousClass013(C23031Ai.class, "feedImmersiveDebugOverlayDev", "getFeedImmersiveDebugOverlayDev()Z", 0), new AnonymousClass013(C23031Ai.class, "feedImmersiveLithoCoalescedDev", "getFeedImmersiveLithoCoalescedDev()Z", 0), new AnonymousClass013(C23031Ai.class, "hasGoneLive", "getHasGoneLive()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSavedMedia", "getHasSavedMedia()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenContentSchedulingUpsell", "getHasSeenContentSchedulingUpsell()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenDaisyCreationNux", "getHasSeenDaisyCreationNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hideLikeAndViewCountsInConsumption", "getHideLikeAndViewCountsInConsumption()Z", 0), new AnonymousClass013(C23031Ai.class, "insightsThriftClient", "getInsightsThriftClient()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "directEmojiReactionSet", "getDirectEmojiReactionSet()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "directDoubleTapEmojiReaction", "getDirectDoubleTapEmojiReaction()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "directReactionsSwipeToSeeMoreNuxCount", "getDirectReactionsSwipeToSeeMoreNuxCount()I", 0), new AnonymousClass013(C23031Ai.class, "hasSeenProfilePinnedHighlightsNux", "getHasSeenProfilePinnedHighlightsNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenDeleteOrHideDialog", "getHasSeenDeleteOrHideDialog()Z", 0)}, 0, c0yrArr, 135, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenContactImportDialog", "getHasSeenContactImportDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFacebookConnectDialog", "getHasSeenFacebookConnectDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "browserAutofillContactSynced", "getBrowserAutofillContactSynced()Z", 0), new AnonymousClass013(C23031Ai.class, "browserAutofillConsentAccepted", "getBrowserAutofillConsentAccepted()Z", 0), new AnonymousClass013(C23031Ai.class, "browserAutofillSuppressNuxQrtExperimentVersionId", "getBrowserAutofillSuppressNuxQrtExperimentVersionId()I", 0), new AnonymousClass013(C23031Ai.class, "browserAutofillPaymentOptIn", "getBrowserAutofillPaymentOptIn()Z", 0), new AnonymousClass013(C23031Ai.class, "safeBrowsingOptIn", "getSafeBrowsingOptIn()Z", 0), new AnonymousClass013(C23031Ai.class, "closeFriendsGalleryPickerUpsellDialogSeen", "getCloseFriendsGalleryPickerUpsellDialogSeen()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAudienceListsNuxTooltip", "getHasSeenAudienceListsNuxTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPrivateStoryShareSheetTooltip", "getHasSeenPrivateStoryShareSheetTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenHallPassOneTimeDisclosure", "getHasSeenHallPassOneTimeDisclosure()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenHallPassCreationNuxDialog", "getHasSeenHallPassCreationNuxDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenHallPassConsumptionNuxDialog", "getHasSeenHallPassConsumptionNuxDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoriesTemplateBackgroundAndOrMusicPinningNuxDialog", "getHasSeenStoriesTemplateBackgroundAndOrMusicPinningNuxDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "allowExpiredReplays", "getAllowExpiredReplays()Z", 0), new AnonymousClass013(C23031Ai.class, "enableStoriesLoadingVisualization", "getEnableStoriesLoadingVisualization()Z", 0), new AnonymousClass013(C23031Ai.class, "realtimeMqttRequestRoutingRegion", "getRealtimeMqttRequestRoutingRegion()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "zeroCmsLocale", "getZeroCmsLocale()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "zeroCmsData", "getZeroCmsData()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "shareSheetTopicsTaggingToolTipShown", "getShareSheetTopicsTaggingToolTipShown()Z", 0), new AnonymousClass013(C23031Ai.class, "shareSheetAudienceControlRowTooltipShown", "getShareSheetAudienceControlRowTooltipShown()Z", 0), new AnonymousClass013(C23031Ai.class, "feedShareSheetAudienceControlRowTooltipShown", "getFeedShareSheetAudienceControlRowTooltipShown()Z", 0), new AnonymousClass013(C23031Ai.class, "shareSheetAudienceControlVisibleCommentDialogShown", "getShareSheetAudienceControlVisibleCommentDialogShown()Z", 0), new AnonymousClass013(C23031Ai.class, "clipsShareSheetProductTagRowTooltipShown", "getClipsShareSheetProductTagRowTooltipShown()Z", 0), new AnonymousClass013(C23031Ai.class, "clipsShareSheetMetaVerifiedAddLinkNewBadgeTapped", "getClipsShareSheetMetaVerifiedAddLinkNewBadgeTapped()Z", 0), new AnonymousClass013(C23031Ai.class, "clipsShareSheetAudioTranslationsRowTapped", "getClipsShareSheetAudioTranslationsRowTapped()Z", 0), new AnonymousClass013(C23031Ai.class, "clipsStickerTranslationsOptInTapped", "getClipsStickerTranslationsOptInTapped()Z", 0)}, 0, c0yrArr, 162, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenClipsAudioTranslationsConsentNuxAndOptedIn", "getHasSeenClipsAudioTranslationsConsentNuxAndOptedIn()Z", 0), new AnonymousClass013(C23031Ai.class, "clipsShareSheetExclusiveContentRowTooltipShown", "getClipsShareSheetExclusiveContentRowTooltipShown()Z", 0), new AnonymousClass013(C23031Ai.class, "clipsShareSheetTemplateOptInRowTooltipShown", "getClipsShareSheetTemplateOptInRowTooltipShown()Z", 0), new AnonymousClass013(C23031Ai.class, "panavisionProfileEntryReelsPosted", "getPanavisionProfileEntryReelsPosted()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMentionReshareTooltip", "getHasSeenMentionReshareTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoryTemplatePinnedMentionTooltop", "getHasSeenStoryTemplatePinnedMentionTooltop()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsAudienceControlBottomsheetTooltip", "getHasSeenClipsAudienceControlBottomsheetTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPublicAccountFollowersOnlyBottomSheetTooltip", "getHasSeenPublicAccountFollowersOnlyBottomSheetTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoryQuestionRespondersNuxTooltip", "getHasSeenStoryQuestionRespondersNuxTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoryQuizRespondersNuxTooltip", "getHasSeenStoryQuizRespondersNuxTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStorySliderVotersNuxTooltip", "getHasSeenStorySliderVotersNuxTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "isCopresenceEnabled", "isCopresenceEnabled()Z", 0), new AnonymousClass013(C23031Ai.class, "hasDismissedFeedCrosspostingLikeSheetUpsell", "getHasDismissedFeedCrosspostingLikeSheetUpsell()Z", 0), new AnonymousClass013(C23031Ai.class, "isLinkSwitcherUpsellsReset", "isLinkSwitcherUpsellsReset()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenHighlightRewindsNuxTooltip", "getHasSeenHighlightRewindsNuxTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "addYoursNuxSeenTimestampMillis", "getAddYoursNuxSeenTimestampMillis()J", 0), new AnonymousClass013(C23031Ai.class, "addYoursToolTipSeenTimestampMillis", "getAddYoursToolTipSeenTimestampMillis()J", 0), new AnonymousClass013(C23031Ai.class, "hasSeenLocationSharingNuxDialog", "getHasSeenLocationSharingNuxDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoriesTemplateMusicPinningUpsell", "getHasSeenStoriesTemplateMusicPinningUpsell()Z", 0), new AnonymousClass013(C23031Ai.class, "hasDismissedStoriesTemplateCameraToolNewBadge", "getHasDismissedStoriesTemplateCameraToolNewBadge()Z", 0), new AnonymousClass013(C23031Ai.class, "storiesTemplateCameraToolNewBadgeImpressionCount", "getStoriesTemplateCameraToolNewBadgeImpressionCount()I", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPostReelParityEditTooltip", "getHasSeenPostReelParityEditTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "stickyArchiveHomeModeId", "getStickyArchiveHomeModeId()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasPinchedToZoomForLandscape", "getHasPinchedToZoomForLandscape()Z", 0), new AnonymousClass013(C23031Ai.class, "shouldShowAddInterestsTooltip", "getShouldShowAddInterestsTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedGroupProfileCreationMenuOption", "getHasTappedGroupProfileCreationMenuOption()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedGroupProfileProfileMenuOption", "getHasTappedGroupProfileProfileMenuOption()Z", 0)}, 0, c0yrArr, 189, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenBarcelonaShareToStoryColorPickerNux", "getHasSeenBarcelonaShareToStoryColorPickerNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenBarcelonaAppSwitcherSelfProfileNux", "getHasSeenBarcelonaAppSwitcherSelfProfileNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenBarcelonaAppSwitcherOtherProfileNux", "getHasSeenBarcelonaAppSwitcherOtherProfileNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsNotifyMeStickerNux", "getHasSeenClipsNotifyMeStickerNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsGenAIMoreMenuTooltip", "getHasSeenClipsGenAIMoreMenuTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPostsGenAISharesheetTooltip", "getHasSeenPostsGenAISharesheetTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedMetaVerifiedProfileMenuOption", "getHasTappedMetaVerifiedProfileMenuOption()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedChannelCreationOption", "getHasTappedChannelCreationOption()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenChannelsCreationToolTip", "getHasSeenChannelsCreationToolTip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenChannelsCreationV2ToolTip", "getHasSeenChannelsCreationV2ToolTip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedChannelInboxDirectoryTooltip", "getHasTappedChannelInboxDirectoryTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPublicGroupProfileNewMemberNux", "getHasSeenPublicGroupProfileNewMemberNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPrivateGroupProfileRequestNux", "getHasSeenPrivateGroupProfileRequestNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSendControlsNux", "getHasSeenSendControlsNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasAcknowledgedDirectShareSheetRepostNux", "getHasAcknowledgedDirectShareSheetRepostNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasCreatedMessengerRoom", "getHasCreatedMessengerRoom()Z", 0), new AnonymousClass013(C23031Ai.class, "isEligibleForIntegrityVerification", "isEligibleForIntegrityVerification()Z", 0), new AnonymousClass013(C23031Ai.class, "allowStoryMentionSharing", "getAllowStoryMentionSharing()Z", 0), new AnonymousClass013(C23031Ai.class, "allowStoryMentionGroupThreadCreation", "getAllowStoryMentionGroupThreadCreation()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoryMentionGroupThreadCreationNux", "getHasSeenStoryMentionGroupThreadCreationNux()Z", 0), new AnonymousClass013(C23031Ai.class, "allowStoryCountdownFollowAndSharing", "getAllowStoryCountdownFollowAndSharing()Z", 0), new AnonymousClass013(C23031Ai.class, "recentBlastSendTargets", "getRecentBlastSendTargets()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "groupEffectsTabBadgeClicked", "getGroupEffectsTabBadgeClicked()Z", 0), new AnonymousClass013(C23031Ai.class, "videoCallScreenShareNuxShown", "getVideoCallScreenShareNuxShown()Z", 0), new AnonymousClass013(C23031Ai.class, "businessProfileCallingBottomSheetShown", "getBusinessProfileCallingBottomSheetShown()Z", 0), new AnonymousClass013(C23031Ai.class, "shareToFBSetting", "getShareToFBSetting()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFacebookStoryDialog", "getHasSeenFacebookStoryDialog()Z", 0)}, 0, c0yrArr, 216, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenFacebookStory", "getHasSeenFacebookStory()Z", 0), new AnonymousClass013(C23031Ai.class, "viper2mConfig", "getViper2mConfig()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "exploreShimmerGridLayout", "getExploreShimmerGridLayout()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "searchNullStateDynamicSections", "getSearchNullStateDynamicSections()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "searchNullStateSearchBoxSuggestions", "getSearchNullStateSearchBoxSuggestions()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "composerAspectRatioNuxSeen", "getComposerAspectRatioNuxSeen()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSentBatchInvite", "getHasSentBatchInvite()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSentContactInvite", "getHasSentContactInvite()Z", 0), new AnonymousClass013(C23031Ai.class, "remainingNuxSteps", "getRemainingNuxSteps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "shoppingBundledNotificationPrototypeExperience", "getShoppingBundledNotificationPrototypeExperience()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "commentWarningSessionId", "getCommentWarningSessionId()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "clientConfigRealtimeUpdateSettingsJson", "getClientConfigRealtimeUpdateSettingsJson()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasShownTooltipForSuggestedUsersShuffleButton", "getHasShownTooltipForSuggestedUsersShuffleButton()Z", 0), new AnonymousClass013(C23031Ai.class, "recentlyUploadedMedia", "getRecentlyUploadedMedia()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hiddenWordsNUXShown", "getHiddenWordsNUXShown()Z", 0), new AnonymousClass013(C23031Ai.class, "reachabilitySettingsUpsellNUXShown", "getReachabilitySettingsUpsellNUXShown()Z", 0), new AnonymousClass013(C23031Ai.class, "verifiedReachabilitySettingsUpsellNUXShown", "getVerifiedReachabilitySettingsUpsellNUXShown()Z", 0), new AnonymousClass013(C23031Ai.class, "limitedInteractionsShouldShowNux", "getLimitedInteractionsShouldShowNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSpendXGetYCouponReceivedOnAdsManager", "getHasSeenSpendXGetYCouponReceivedOnAdsManager()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSifuHeaderTooltip", "getHasSeenSifuHeaderTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "linkedPageIgDmAccessSetting", "getLinkedPageIgDmAccessSetting()Z", 0), new AnonymousClass013(C23031Ai.class, "stickerIdAddedViaFeedMegaphone", "getStickerIdAddedViaFeedMegaphone()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasAcknowledgedMusicChangesNux", "getHasAcknowledgedMusicChangesNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenClipsRemixPhotosNux", "getSeenClipsRemixPhotosNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenClipsRemixFeedVideoNux", "getSeenClipsRemixFeedVideoNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenSeparateSequenceNux", "getSeenSeparateSequenceNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenNewRemixIntroductionNux", "getSeenNewRemixIntroductionNux()Z", 0)}, 0, c0yrArr, 243, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "seenClipsDraftUninstallNux", "getSeenClipsDraftUninstallNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenClipsDraftBackupNux", "getSeenClipsDraftBackupNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenFeedRemixPhotosNux", "getSeenFeedRemixPhotosNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenSelfCropPhotoNux", "getSeenSelfCropPhotoNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenPinToGridNux", "getSeenPinToGridNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenRepostSheetTitleNux", "getSeenRepostSheetTitleNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenClipsVisualReplyAnyoneNoticeTooltip", "getSeenClipsVisualReplyAnyoneNoticeTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "seenCommentShareCommenterNoticeTooltip", "getSeenCommentShareCommenterNoticeTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "seenCommentReShareTooltip", "getSeenCommentReShareTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "seenCommentShareScreenshotDialog", "getSeenCommentShareScreenshotDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "seenFeedVisualReplyAnyoneNoticeTooltip", "getSeenFeedVisualReplyAnyoneNoticeTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "seenClipsVisualReplyAnyoneDialogNux", "getSeenClipsVisualReplyAnyoneDialogNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenClipsVisualReplyFeedAnyoneDialogNux", "getSeenClipsVisualReplyFeedAnyoneDialogNux()Z", 0), new AnonymousClass013(C23031Ai.class, "clipsVisualReplyCreationTried", "getClipsVisualReplyCreationTried()Z", 0), new AnonymousClass013(C23031Ai.class, "seenLiveToClipsDialogNux", "getSeenLiveToClipsDialogNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSmbSupportButtonTooltipForLeadGen", "getHasSeenSmbSupportButtonTooltipForLeadGen()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenLeadGenMultiSubmitNuxTooltip", "getHasSeenLeadGenMultiSubmitNuxTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenEditProfileButtonForLeadGenTooltip", "getHasSeenEditProfileButtonForLeadGenTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenEditProfileButtonForExpiringDiscountTooltip", "getHasSeenEditProfileButtonForExpiringDiscountTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenActionButtonsForLeadGenTooltip", "getHasSeenActionButtonsForLeadGenTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenBusinessToolTooltip", "getHasSeenBusinessToolTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasCreatedFirstBusinessOrder", "getHasCreatedFirstBusinessOrder()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOrderDetailsNux", "getHasSeenOrderDetailsNux()Z", 0), new AnonymousClass013(C23031Ai.class, "lastSeenSelfStandaloneFundraiserSnackBar", "getLastSeenSelfStandaloneFundraiserSnackBar()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenEditProfileButtonForFeaturedAccountsTooltip", "getHasSeenEditProfileButtonForFeaturedAccountsTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "feedRecsSelectedTabGroupId", "getFeedRecsSelectedTabGroupId()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "interopStatusResponseJson", "getInteropStatusResponseJson()Ljava/lang/String;", 0)}, 0, c0yrArr, 270, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "isCameraToolMenuRightSide", "isCameraToolMenuRightSide()Z", 0), new AnonymousClass013(C23031Ai.class, "hasUserDismissedFirstInteropSendNux", "getHasUserDismissedFirstInteropSendNux()Z", 0), new AnonymousClass013(C23031Ai.class, "xacAutoUpgradeInterstitialText", "getXacAutoUpgradeInterstitialText()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "interopReachabilitySettingPendingJson", "getInteropReachabilitySettingPendingJson()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "prefetchEntries", "getPrefetchEntries()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenUpcomingEventCreationNuxDialog", "getHasSeenUpcomingEventCreationNuxDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenQuickReactionSkintoneNux", "getHasSeenQuickReactionSkintoneNux()Z", 0), new AnonymousClass013(C23031Ai.class, "qrSkintoneNuxEligibleEmojiString", "getQrSkintoneNuxEligibleEmojiString()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "fxCalAccountCenterInfo", "getFxCalAccountCenterInfo()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "fxLinkageCacheSwitcherInfo", "getFxLinkageCacheSwitcherInfo()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "fxImShouldShowXpostingFeedIsUpsell", "getFxImShouldShowXpostingFeedIsUpsell()Z", 0), new AnonymousClass013(C23031Ai.class, "shouldShowInteractivityUpsellAssetButtonNux", "getShouldShowInteractivityUpsellAssetButtonNux()Z", 0), new AnonymousClass013(C23031Ai.class, "lastRecipientPickerSessionId", "getLastRecipientPickerSessionId()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoryDraftsExpirationNux", "getHasSeenStoryDraftsExpirationNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsTextToSpeechTooltip", "getHasSeenClipsTextToSpeechTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenResizePostcaptureTooltip", "getHasSeenResizePostcaptureTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenDraftsFilterTooltip", "getHasSeenDraftsFilterTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenGalleryDraftsCellTooltip", "getHasSeenGalleryDraftsCellTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenGalleryTemplateCellTooltip", "getHasSeenGalleryTemplateCellTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSwitchToReelsTooltip", "getHasSeenSwitchToReelsTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPermanentMediaEditTooltip", "getHasSeenPermanentMediaEditTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsQuestionAnswerStickerPostCaptureDialogNux", "getHasSeenClipsQuestionAnswerStickerPostCaptureDialogNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsQuestionAnswerStickerPostCaptureTooltip", "getHasSeenClipsQuestionAnswerStickerPostCaptureTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFeedPostNewPostCaptureNux", "getHasSeenFeedPostNewPostCaptureNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsCutoutAnythingStickerPostCaptureDialogNux", "getHasSeenClipsCutoutAnythingStickerPostCaptureDialogNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoriesCutoutAnythingStickerPostCaptureDialogNux", "getHasSeenStoriesCutoutAnythingStickerPostCaptureDialogNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCutoutAnythingFirstStickerCreatedDialogNux", "getHasSeenCutoutAnythingFirstStickerCreatedDialogNux()Z", 0)}, 0, c0yrArr, 297, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenCutoutAnythingStickerTrayTooltip", "getHasSeenCutoutAnythingStickerTrayTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCutoutAnythingPostcapNuxIntroTooltipClips", "getHasSeenCutoutAnythingPostcapNuxIntroTooltipClips()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCutoutAnythingPostcapNuxIntroTooltipStories", "getHasSeenCutoutAnythingPostcapNuxIntroTooltipStories()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCutoutStickerMerchandisingConsumptionFirstTimeExposureNux", "getHasSeenCutoutStickerMerchandisingConsumptionFirstTimeExposureNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCutoutAnythingStickerVideoTrimAudioTooltip", "getHasSeenCutoutAnythingStickerVideoTrimAudioTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenUpdatedMixedAspectRatiosCropToggle", "getHasSeenUpdatedMixedAspectRatiosCropToggle()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenReuseControlsExistingUserIntroNux", "getHasSeenReuseControlsExistingUserIntroNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenReuseControlsNewUserPostNux", "getHasSeenReuseControlsNewUserPostNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenReuseControlsNewUserReelNUX", "getHasSeenReuseControlsNewUserReelNUX()Z", 0), new AnonymousClass013(C23031Ai.class, "clipsCoverPhotoTextAddingNuxTooltipSeenCount", "getClipsCoverPhotoTextAddingNuxTooltipSeenCount()I", 0), new AnonymousClass013(C23031Ai.class, "clipsCoverPhotoTextAddingPreviousSessionId", "getClipsCoverPhotoTextAddingPreviousSessionId()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "directMessageNotificationMute", "getDirectMessageNotificationMute()Z", 0), new AnonymousClass013(C23031Ai.class, "directMessageRequestNotificationMute", "getDirectMessageRequestNotificationMute()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenLongReelsDialogNux", "getHasSeenLongReelsDialogNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenPhotomashDialogNux", "getHasSeenPhotomashDialogNux()Z", 0), new AnonymousClass013(C23031Ai.class, "mediaMetadataCleanupTimestampMs", "getMediaMetadataCleanupTimestampMs()J", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCarouselMaxSizeIncreaseNux", "getHasSeenCarouselMaxSizeIncreaseNux()Z", 0), new AnonymousClass013(C23031Ai.class, "isGallerySuggestionsEnabled", "isGallerySuggestionsEnabled()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoryGlassesBottomSheet", "getHasSeenStoryGlassesBottomSheet()Z", 0), new AnonymousClass013(C23031Ai.class, "hasHeardStoryGlassesPreviewNux", "getHasHeardStoryGlassesPreviewNux()Z", 0), new AnonymousClass013(C23031Ai.class, "mwaLastSyncedAppVersion", "getMwaLastSyncedAppVersion()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "supLastSyncedFirmwareVersion", "getSupLastSyncedFirmwareVersion()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "igLastSyncedAppVersion", "getIgLastSyncedAppVersion()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "supToolkitLastSyncedDeviceImageAsset", "getSupToolkitLastSyncedDeviceImageAsset()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "supToolkitLastSyncedDeviceModelName", "getSupToolkitLastSyncedDeviceModelName()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "supToolkitLastSyncedDeviceFirmware", "getSupToolkitLastSyncedDeviceFirmware()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "limitedInteractionsEnabled", "getLimitedInteractionsEnabled()Z", 0)}, 0, c0yrArr, 324, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "limitedInteractionsNonFollowersEnabled", "getLimitedInteractionsNonFollowersEnabled()Z", 0), new AnonymousClass013(C23031Ai.class, "limitedInteractionsNewFollowersEnabled", "getLimitedInteractionsNewFollowersEnabled()Z", 0), new AnonymousClass013(C23031Ai.class, "autoCreatedReelsFromCameraRollNotificationSent", "getAutoCreatedReelsFromCameraRollNotificationSent()Z", 0), new AnonymousClass013(C23031Ai.class, "reelLastModifiedDraft", "getReelLastModifiedDraft()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenDirectVM24hrSelfReplayNuxDialog", "getHasSeenDirectVM24hrSelfReplayNuxDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "userConsentQueryLoaded", "getUserConsentQueryLoaded()Z", 0), new AnonymousClass013(C23031Ai.class, "userConsentQueryConsented", "getUserConsentQueryConsented()Z", 0), new AnonymousClass013(C23031Ai.class, "userConsentQuerySettingsRequired", "getUserConsentQuerySettingsRequired()Z", 0), new AnonymousClass013(C23031Ai.class, "userConsentQueryFirstPartyTracking", "getUserConsentQueryFirstPartyTracking()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenVisualSearchCameraTooltipOnShopTab", "getHasSeenVisualSearchCameraTooltipOnShopTab()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenVisualSearchCameraNuxDialog", "getHasSeenVisualSearchCameraNuxDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "unlikedTimestampsSec", "getUnlikedTimestampsSec()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "unlikedData", "getUnlikedData()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "deletedPostTimestamps", "getDeletedPostTimestamps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "deletedClipTimestamps", "getDeletedClipTimestamps()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "isCustomLauncherSyncInterval", "isCustomLauncherSyncInterval()Z", 0), new AnonymousClass013(C23031Ai.class, "basicAdsOptInStatus", "getBasicAdsOptInStatus()Z", 0), new AnonymousClass013(C23031Ai.class, "basicAdsTier", "getBasicAdsTier()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "afsEnablementStatus", "getAfsEnablementStatus()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "connectionServiceUserPhoneAccountId", "getConnectionServiceUserPhoneAccountId()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenManageYourDraftTooltip", "getHasSeenManageYourDraftTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasClipsTogetherAudioVideoDialogBeenSeen", "getHasClipsTogetherAudioVideoDialogBeenSeen()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAddClipTooltip", "getHasSeenAddClipTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedOnExternalSharingOverflowUserEducation", "getHasTappedOnExternalSharingOverflowUserEducation()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenExternalSharingOverflowUserEducation", "getHasSeenExternalSharingOverflowUserEducation()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenExternalSharingAppTrayNux", "getHasSeenExternalSharingAppTrayNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenExternalSharingEducationNux", "getHasSeenExternalSharingEducationNux()Z", 0)}, 0, c0yrArr, 351, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "externalSharingEducationNuxImpressionCount", "getExternalSharingEducationNuxImpressionCount()I", 0), new AnonymousClass013(C23031Ai.class, "externalSharingUniverseName", "getExternalSharingUniverseName()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAcrCameraRollAccessConsentNux", "getHasSeenAcrCameraRollAccessConsentNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasAllowedAcrCameraRollAccess", "getHasAllowedAcrCameraRollAccess()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCameraRollAccessConfirmNux", "getHasSeenCameraRollAccessConfirmNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsReuseTextDialog", "getHasSeenClipsReuseTextDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "lastSeenClipsSuggestedAudioPillTrackId", "getLastSeenClipsSuggestedAudioPillTrackId()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "lastUsedCameraDestinationInPlusBar", "getLastUsedCameraDestinationInPlusBar()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "mostUsedCameraDestination", "getMostUsedCameraDestination()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasAcceptedSuggestedRepliesNux", "getHasAcceptedSuggestedRepliesNux()Z", 0), new AnonymousClass013(C23031Ai.class, "eligibleForSuggestedRepliesTooltip", "getEligibleForSuggestedRepliesTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "numTimesSeenSuggestedRepliesNux", "getNumTimesSeenSuggestedRepliesNux()J", 0), new AnonymousClass013(C23031Ai.class, "injectedPostToFeed", "getInjectedPostToFeed()Z", 0), new AnonymousClass013(C23031Ai.class, "hasAcceptedDiscoverableChatCreateFlowNux", "getHasAcceptedDiscoverableChatCreateFlowNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenChannelCreatorNux", "getHasSeenChannelCreatorNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenDiscoverableChatJoinFlowNux", "getHasSeenDiscoverableChatJoinFlowNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenGroupProfileChannelCreateFlowNux", "getHasSeenGroupProfileChannelCreateFlowNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenGroupProfileChannelJoinFlowNux", "getHasSeenGroupProfileChannelJoinFlowNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasAcceptedHighRiskNux", "getHasAcceptedHighRiskNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNotesCreationNux", "getHasSeenNotesCreationNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenGroupMentionEntryNux", "getHasSeenGroupMentionEntryNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenGroupMentionParticipationNux", "getHasSeenGroupMentionParticipationNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNotesReplyNux", "getHasSeenNotesReplyNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNotesReplyAvatarTab", "getHasSeenNotesReplyAvatarTab()Z", 0), new AnonymousClass013(C23031Ai.class, "lastSeenNotesReplyTab", "getLastSeenNotesReplyTab()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCFHubMusicNotesDisclaimer", "getHasSeenCFHubMusicNotesDisclaimer()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsPlayedByConsumptionSnackbar", "getHasSeenClipsPlayedByConsumptionSnackbar()Z", 0)}, 0, c0yrArr, 378, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenAudioTopBarEducationalNux", "getHasSeenAudioTopBarEducationalNux()Z", 0), new AnonymousClass013(C23031Ai.class, "showDirectUnsendMessageEducationalDialog", "getShowDirectUnsendMessageEducationalDialog()Z", 0), new AnonymousClass013(C23031Ai.class, "seenPostAddOrganicCtaTooltipNux", "getSeenPostAddOrganicCtaTooltipNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenPostReelAddOrganicCtaTooltipNux", "getSeenPostReelAddOrganicCtaTooltipNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenReelAddOrganicCtaTooltipNux", "getSeenReelAddOrganicCtaTooltipNux()Z", 0), new AnonymousClass013(C23031Ai.class, "seenPostSellProductRowTooltipNux", "getSeenPostSellProductRowTooltipNux()Z", 0), new AnonymousClass013(C23031Ai.class, "sellProductRowTapped", "getSellProductRowTapped()Z", 0), new AnonymousClass013(C23031Ai.class, "reelSellProductRowTapped", "getReelSellProductRowTapped()Z", 0), new AnonymousClass013(C23031Ai.class, "selectedCurrency", "getSelectedCurrency()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenTasEducationScreenNux", "getHasSeenTasEducationScreenNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAltTextEntrypointNux", "getHasSeenAltTextEntrypointNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenTasTooltipNux", "getHasSeenTasTooltipNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOrganicIabMessageExtTooltip", "getHasSeenOrganicIabMessageExtTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStackedTimelinePreviewFlingEducationNux", "getHasSeenStackedTimelinePreviewFlingEducationNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStackedTimelineMultipleAudioTrackAddAudioTooltip", "getHasSeenStackedTimelineMultipleAudioTrackAddAudioTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMemeBackgroundSelectedCutoutStickerDurationTooltip", "getHasSeenMemeBackgroundSelectedCutoutStickerDurationTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStacksToReelsTooltip", "getHasSeenStacksToReelsTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCollaborativeAlbumsCreationTooltip", "getHasSeenCollaborativeAlbumsCreationTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCollaborativeAlbumsCreationNux", "getHasSeenCollaborativeAlbumsCreationNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenCollaborativeAlbumsRecipientNux", "getHasSeenCollaborativeAlbumsRecipientNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsCollaboratorPreloadedNux", "getHasSeenClipsCollaboratorPreloadedNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsInviteCollaboratorsNux", "getHasSeenClipsInviteCollaboratorsNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsInviteFirstFewCollaboratorsPreloadedNux", "getHasSeenClipsInviteFirstFewCollaboratorsPreloadedNux()Z", 0), new AnonymousClass013(C23031Ai.class, "isMentionReshareFullScreen", "isMentionReshareFullScreen()Z", 0), new AnonymousClass013(C23031Ai.class, "shouldShowMentionReshareTooltip", "getShouldShowMentionReshareTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "aiThemesGenerationNewBadgeImpressionCount", "getAiThemesGenerationNewBadgeImpressionCount()I", 0), new AnonymousClass013(C23031Ai.class, "aiThemesWasOpened", "getAiThemesWasOpened()Z", 0)}, 0, c0yrArr, 405, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasSeenTrendReportBanner", "getHasSeenTrendReportBanner()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenArtistPinningTooltip", "getHasSeenArtistPinningTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenHiddenWordsPredefinedListSecureConsentNUX", "getHasSeenHiddenWordsPredefinedListSecureConsentNUX()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenHiddenWordsCustomListSecureConsentNUX", "getHasSeenHiddenWordsCustomListSecureConsentNUX()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenHiddenWordsCustomWordListSecureConsentNUX", "getHasSeenHiddenWordsCustomWordListSecureConsentNUX()Z", 0), new AnonymousClass013(C23031Ai.class, "hiddenWordsCustomWordListServerOptimisticValue", "getHiddenWordsCustomWordListServerOptimisticValue()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasSeenHiddenWordsConsentSaveActionWarningNUX", "getHasSeenHiddenWordsConsentSaveActionWarningNUX()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOnDeviceNuditySecureConsentNUX", "getHasSeenOnDeviceNuditySecureConsentNUX()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedReconDestinationProfileMenuOption", "getHasTappedReconDestinationProfileMenuOption()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenReconDestinationNUX", "getHasSeenReconDestinationNUX()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenReusableTextToolTip", "getHasSeenReusableTextToolTip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenClipsViewerSequentialRemixTooltip", "getHasSeenClipsViewerSequentialRemixTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSelfReelInsightsTooltip", "getHasSeenSelfReelInsightsTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenUpcomingEventOnProfileTooltip", "getHasSeenUpcomingEventOnProfileTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasDismissedModeratorRoleNux", "getHasDismissedModeratorRoleNux()Z", 0), new AnonymousClass013(C23031Ai.class, "eventRecentEmojiList", "getEventRecentEmojiList()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "hasTappedQuietPostingCreationMenuOption", "getHasTappedQuietPostingCreationMenuOption()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedMusicHighlightCreationMenuOption", "getHasTappedMusicHighlightCreationMenuOption()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedAiAgentCreationMenuOption", "getHasTappedAiAgentCreationMenuOption()Z", 0), new AnonymousClass013(C23031Ai.class, "hasDismissedCreationMenuBadgeForAiAgentOption", "getHasDismissedCreationMenuBadgeForAiAgentOption()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenBroadcastChannelQuestionPromptTooltip", "getHasSeenBroadcastChannelQuestionPromptTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSelfOpalNuxBottomsheet", "getHasSeenSelfOpalNuxBottomsheet()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenUserOpalBadgeIntro", "getHasSeenUserOpalBadgeIntro()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOpalAudienceTooltip", "getHasSeenOpalAudienceTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenUserOpalNuxBottomsheet", "getHasSeenUserOpalNuxBottomsheet()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedOnClipsChannelSticker", "getHasTappedOnClipsChannelSticker()Z", 0), new AnonymousClass013(C23031Ai.class, "hasEnteredLayeringTool", "getHasEnteredLayeringTool()Z", 0)}, 0, c0yrArr, 432, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "hasOnboardedIntoMemu", "getHasOnboardedIntoMemu()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMagicModDisclosureNuxV1", "getHasSeenMagicModDisclosureNuxV1()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMagicModDisclosureNuxV2", "getHasSeenMagicModDisclosureNuxV2()Z", 0), new AnonymousClass013(C23031Ai.class, "hasConsentedMagicModToolBackdrop", "getHasConsentedMagicModToolBackdrop()Z", 0), new AnonymousClass013(C23031Ai.class, "hasConsentedMagicModToolExpander", "getHasConsentedMagicModToolExpander()Z", 0), new AnonymousClass013(C23031Ai.class, "hasConsentedMagicModToolRestyle", "getHasConsentedMagicModToolRestyle()Z", 0), new AnonymousClass013(C23031Ai.class, "hasConsentedMemuCreatorTemplates", "getHasConsentedMemuCreatorTemplates()Z", 0), new AnonymousClass013(C23031Ai.class, "magicModConsentLastUpdatedTimeInMs", "getMagicModConsentLastUpdatedTimeInMs()J", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMagicModBackdropTooltip", "getHasSeenMagicModBackdropTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMagicModBundleTooltip", "getHasSeenMagicModBundleTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenMagicModRestyleTooltip", "getHasSeenMagicModRestyleTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAiContextualBackgroundTooltip", "getHasSeenAiContextualBackgroundTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenAiContextualBackgroundNux", "getHasSeenAiContextualBackgroundNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSignedUpForMagicModToolNotification", "getHasSignedUpForMagicModToolNotification()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTriggeredMagicModBackdropNotification", "getHasTriggeredMagicModBackdropNotification()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTriggeredMagicModRestyleNotification", "getHasTriggeredMagicModRestyleNotification()Z", 0), new AnonymousClass013(C23031Ai.class, "metaGalleryRecents", "getMetaGalleryRecents()Ljava/lang/String;", 0), new AnonymousClass013(C23031Ai.class, "enableOpeningLinkInExternalBrowser", "getEnableOpeningLinkInExternalBrowser()Z", 0), new AnonymousClass013(C23031Ai.class, "proUserCustomerDetailsToSAcceptStatus", "getProUserCustomerDetailsToSAcceptStatus()I", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNewFeedFiltersNux", "getHasSeenNewFeedFiltersNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFeedReorderNux", "getHasSeenFeedReorderNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenFeedVideoZoomNux", "getHasSeenFeedVideoZoomNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenNewAudioFiltersNux", "getHasSeenNewAudioFiltersNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenImmersiveReelReshareFullScreenNux", "getHasSeenImmersiveReelReshareFullScreenNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenImmersiveReelReshareShrinkNux", "getHasSeenImmersiveReelReshareShrinkNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenStoriesSoftTaggingNux", "getHasSeenStoriesSoftTaggingNux()Z", 0), new AnonymousClass013(C23031Ai.class, "isReelReshareFullScreen", "isReelReshareFullScreen()Z", 0)}, 0, c0yrArr, 459, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "isContentSchedulingInShareSheetEnabled", "isContentSchedulingInShareSheetEnabled()Z", 0), new AnonymousClass013(C23031Ai.class, "hasDismissedInvitesSearchRowTypeahead", "getHasDismissedInvitesSearchRowTypeahead()Z", 0), new AnonymousClass013(C23031Ai.class, "hasDismissedInvitesSearchRowSerp", "getHasDismissedInvitesSearchRowSerp()Z", 0), new AnonymousClass013(C23031Ai.class, "wallBadgeLastFetchedTimestamp", "getWallBadgeLastFetchedTimestamp()J", 0), new AnonymousClass013(C23031Ai.class, "wallBadgeCount", "getWallBadgeCount()I", 0), new AnonymousClass013(C23031Ai.class, "wallSelfProfileTooltipLastShownTimestamp", "getWallSelfProfileTooltipLastShownTimestamp()J", 0), new AnonymousClass013(C23031Ai.class, "wallOtherProfileTooltipLastShownTimestamp", "getWallOtherProfileTooltipLastShownTimestamp()J", 0), new AnonymousClass013(C23031Ai.class, "wallSelfProfileHeaderTooltipCount", "getWallSelfProfileHeaderTooltipCount()I", 0), new AnonymousClass013(C23031Ai.class, "wallOtherProfileHeaderTooltipCount", "getWallOtherProfileHeaderTooltipCount()I", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSelfWallNux", "getHasSeenSelfWallNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenOtherWallNux", "getHasSeenOtherWallNux()Z", 0), new AnonymousClass013(C23031Ai.class, "friendMapLocationConsentGranted", "getFriendMapLocationConsentGranted()Z", 0), new AnonymousClass013(C23031Ai.class, "friendMapNotesNuxShownTimes", "getFriendMapNotesNuxShownTimes()I", 0), new AnonymousClass013(C23031Ai.class, "friendMapLocationNuxShownTimes", "getFriendMapLocationNuxShownTimes()I", 0), new AnonymousClass013(C23031Ai.class, "friendMapLocationTrustDialogShownTimes", "getFriendMapLocationTrustDialogShownTimes()I", 0), new AnonymousClass013(C23031Ai.class, "friendMapCreateNoteTooltipImpressions", "getFriendMapCreateNoteTooltipImpressions()I", 0), new AnonymousClass013(C23031Ai.class, "friendMapCreateNoteShownTimestamp", "getFriendMapCreateNoteShownTimestamp()J", 0), new AnonymousClass013(C23031Ai.class, "friendMapSettingsTooltipImpressions", "getFriendMapSettingsTooltipImpressions()I", 0), new AnonymousClass013(C23031Ai.class, "friendMapSettingsTooltipShownTimestamp", "getFriendMapSettingsTooltipShownTimestamp()J", 0), new AnonymousClass013(C23031Ai.class, "friendMapNotesTrayBadgeShown", "getFriendMapNotesTrayBadgeShown()Z", 0), new AnonymousClass013(C23031Ai.class, "friendMapNotesTrayBadgeShownTimestamp", "getFriendMapNotesTrayBadgeShownTimestamp()J", 0), new AnonymousClass013(C23031Ai.class, "friendMapHiddenPlacesTooltipImpressions", "getFriendMapHiddenPlacesTooltipImpressions()I", 0), new AnonymousClass013(C23031Ai.class, "blackHoleUrlLastSyncDate", "getBlackHoleUrlLastSyncDate()J", 0), new AnonymousClass013(C23031Ai.class, "shouldShowOdnTeensUserNotice", "getShouldShowOdnTeensUserNotice()Z", 0), new AnonymousClass013(C23031Ai.class, "shouldShowE2EEPreviews", "getShouldShowE2EEPreviews()Z", 0), new AnonymousClass013(C23031Ai.class, "destinationToolbarTemplateAnimationNuxSeenCount", "getDestinationToolbarTemplateAnimationNuxSeenCount()I", 0), new AnonymousClass013(C23031Ai.class, "destinationToolbarMusicAnimationNuxSeenCount", "getDestinationToolbarMusicAnimationNuxSeenCount()I", 0)}, 0, c0yrArr, 486, 27);
        System.arraycopy(new C0YR[]{new AnonymousClass013(C23031Ai.class, "destinationToolbarMusicVinylNuxSeenCount", "getDestinationToolbarMusicVinylNuxSeenCount()I", 0), new AnonymousClass013(C23031Ai.class, "hasDismissedDestinationToolbarMusicFirstNewBadge", "getHasDismissedDestinationToolbarMusicFirstNewBadge()Z", 0), new AnonymousClass013(C23031Ai.class, "destinationToolbarMusicFirstNewBadgeImpressionCount", "getDestinationToolbarMusicFirstNewBadgeImpressionCount()I", 0), new AnonymousClass013(C23031Ai.class, "clipsScheduleNewBadgeImpressionCount", "getClipsScheduleNewBadgeImpressionCount()I", 0), new AnonymousClass013(C23031Ai.class, "quickSnapCreationOnboardingCompleted", "getQuickSnapCreationOnboardingCompleted()Z", 0), new AnonymousClass013(C23031Ai.class, "quickSnapPracticeOnboardingCompleted", "getQuickSnapPracticeOnboardingCompleted()Z", 0), new AnonymousClass013(C23031Ai.class, "quickSnapArchiveTooltipShownCount", "getQuickSnapArchiveTooltipShownCount()I", 0), new AnonymousClass013(C23031Ai.class, "quickSnapArchiveTooltipShownTimestamp", "getQuickSnapArchiveTooltipShownTimestamp()J", 0), new AnonymousClass013(C23031Ai.class, "hasSeenQuickSnapConsumptionNux", "getHasSeenQuickSnapConsumptionNux()Z", 0), new AnonymousClass013(C23031Ai.class, "quickSnapTabIconUpsellShownCount", "getQuickSnapTabIconUpsellShownCount()I", 0), new AnonymousClass013(C23031Ai.class, "hasSeenQuickSnapNewBadgeUpsell", "getHasSeenQuickSnapNewBadgeUpsell()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenSelfTrialReelInsightEntryPointTooltip", "getHasSeenSelfTrialReelInsightEntryPointTooltip()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenIgdFilterFlagRedesignBanner", "getHasSeenIgdFilterFlagRedesignBanner()Z", 0), new AnonymousClass013(C23031Ai.class, "hasSeenDetectedOutcomesNux", "getHasSeenDetectedOutcomesNux()Z", 0), new AnonymousClass013(C23031Ai.class, "hasTappedCreatorViewerInsightsLineNux", "getHasTappedCreatorViewerInsightsLineNux()Z", 0), new AnonymousClass013(C23031Ai.class, "detectedOutcomesNuxLastCheckTimestampMs", "getDetectedOutcomesNuxLastCheckTimestampMs()J", 0), new AnonymousClass013(C23031Ai.class, "mediaReminderInFeedLastSeenTimestampMs", "getMediaReminderInFeedLastSeenTimestampMs()J", 0), new AnonymousClass013(C23031Ai.class, "hasDismissedDestinationToolbarSavedAudioClipsGalleryNewBadge", "getHasDismissedDestinationToolbarSavedAudioClipsGalleryNewBadge()Z", 0)}, 0, c0yrArr, 513, 18);
        A8c = c0yrArr;
    }

    public static final String A01(C1XV c1xv) {
        if (c1xv == C1XV.A0v) {
            return "suggested_users";
        }
        if (c1xv == C1XV.A0r) {
            return "suggested_producers";
        }
        return null;
    }

    public static final HashMap A02(C23031Ai c23031Ai, String str) {
        Object putIfAbsent;
        if (C18U.A06(C06090Tz.A05, c23031Ai.A00, 36327486225726072L)) {
            ConcurrentHashMap concurrentHashMap = c23031Ai.A02;
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = c23031Ai.A03(str)))) != null) {
                obj = putIfAbsent;
            }
            return (HashMap) obj;
        }
        return c23031Ai.A03(str);
    }

    private final HashMap A03(String str) {
        int i;
        HashMap hashMap;
        String A0S = AnonymousClass001.A0S("UserPreferences.getStoredMapFromPrefs(", str, ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0S, -131794729);
        }
        try {
            HashMap hashMap2 = new HashMap();
            String string = this.A01.getString(str, "");
            if (string != null) {
                boolean z = false;
                if (string.length() == 0) {
                    z = true;
                }
                if (!z) {
                    try {
                        try {
                            hashMap = (HashMap) new Gson().A08(string, hashMap2.getClass());
                        } catch (C90063zm unused) {
                            C0w9.A03("UserPreferences", AnonymousClass001.A0R("Corrupted Map Data for ", str));
                        }
                    } catch (IllegalStateException unused2) {
                        C0w9.A03("UserPreferences", AnonymousClass001.A0R("Corrupted Map Data for ", str));
                    }
                    if (hashMap != null) {
                        hashMap2 = hashMap;
                        if (Systrace.A0E(1L)) {
                            i = -913607107;
                            C0fO.A00(i);
                        }
                        return hashMap2;
                    }
                    if (Systrace.A0E(1L)) {
                        i = -1049706101;
                        C0fO.A00(i);
                    }
                    return hashMap2;
                }
            }
            A05(this, str, hashMap2);
            if (Systrace.A0E(1L)) {
                i = 10358652;
                C0fO.A00(i);
            }
            return hashMap2;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(467211640);
            }
            throw th;
        }
    }

    public static final List A04(C23031Ai c23031Ai, String str) {
        ArrayList arrayList = new ArrayList();
        String string = c23031Ai.A01.getString(str, "");
        if (string != null) {
            boolean z = false;
            if (string.length() == 0) {
                z = true;
            }
            if (!z) {
                try {
                    List list = (List) new Gson().A08(string, arrayList.getClass());
                    if (list != null) {
                        return list;
                    }
                    return arrayList;
                } catch (C90063zm | IllegalStateException unused) {
                    C0w9.A03("UserPreferences", AnonymousClass001.A0R("Corrupted List Data for ", str));
                    return arrayList;
                }
            }
        }
        A06(c23031Ai, str, arrayList);
        return arrayList;
    }

    public static final void A05(C23031Ai c23031Ai, String str, HashMap hashMap) {
        String A0S = AnonymousClass001.A0S("UserPreferences.setMap(", str, ')');
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0S, 215373472);
        }
        try {
            String A0B = new Gson().A0B(hashMap);
            InterfaceC19610xo ARD = c23031Ai.A01.ARD();
            ARD.E7K(str, A0B);
            ARD.apply();
            c23031Ai.A02.put(str, hashMap);
            if (Systrace.A0E(1L)) {
                C0fO.A00(454706451);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1678805322);
            }
            throw th;
        }
    }

    public static final void A06(C23031Ai c23031Ai, String str, List list) {
        String A0B = new Gson().A0B(list);
        InterfaceC19610xo ARD = c23031Ai.A01.ARD();
        ARD.E7K(str, A0B);
        ARD.apply();
    }

    public final int A09() {
        return ((Number) this.A8E.CES(this, A8c[62])).intValue();
    }

    public final long A0A() {
        InterfaceC19630xq interfaceC19630xq = this.A01;
        int i = interfaceC19630xq.getInt("take_a_break_nudge_last_seen_count", 0);
        long j = interfaceC19630xq.getLong(AnonymousClass001.A0O("take_a_break_nudge_last_seen_time_prefix_", i - 1), 0L);
        if (i > 0 && j == 0) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7D("take_a_break_nudge_last_seen_count", 0);
            ARD.apply();
            return 0L;
        }
        return j;
    }

    public final C191498e5 A0B() {
        C191498e5 A00;
        String string = this.A01.getString("auto_created_clips_source_medium_cache", null);
        if (string != null) {
            try {
                AbstractMap abstractMap = (AbstractMap) new Gson().A09(string, new TypeToken<HashMap<String, Medium>>() { // from class: X.8jm
                }.type);
                if (abstractMap != null && (A00 = AbstractC191488e4.A00()) != null) {
                    boolean z = false;
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        Object key = entry.getKey();
                        Medium medium = (Medium) entry.getValue();
                        if (medium.A06() && new File(medium.A0X).exists()) {
                            A00.put(key, medium);
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        A0o(A00);
                    }
                    return A00;
                }
            } catch (C90063zm unused) {
                C0w9.A03("UserPreferences", "Corrupted cache content for auto-created clips story medium cache");
                return null;
            } catch (C90083zo unused2) {
                C0w9.A03("UserPreferences", "Corrupted cache content for auto-created clips story medium cache");
                return null;
            } catch (IllegalStateException unused3) {
                C0w9.A03("UserPreferences", "Corrupted cache content for auto-created clips story medium cache");
            } catch (NumberFormatException unused4) {
                C0w9.A03("UserPreferences", "Corrupted cache content for auto-created clips story medium cache");
                return null;
            }
        }
        return null;
    }

    public final String A0C() {
        return (String) this.A0I.CES(this, A8c[368]);
    }

    public final HashMap A0D() {
        HashMap hashMap = new HashMap();
        InterfaceC19630xq interfaceC19630xq = this.A01;
        String string = interfaceC19630xq.getString("clips_auto_saved_draft_ID", "");
        boolean z = interfaceC19630xq.getBoolean("clips_auto_saved_draft_notif_schedule_status", false);
        int i = interfaceC19630xq.getInt("clips_auto_saved_draft_notif_schedule_attempt_count", 0);
        if (string != null && string.length() != 0) {
            hashMap.put(string, new Pair(Boolean.valueOf(z), Integer.valueOf(i)));
        }
        return hashMap;
    }

    public final HashMap A0E() {
        HashMap hashMap = new HashMap();
        String string = this.A01.getString("nudge_tracker_map", "");
        if (string != null) {
            boolean z = false;
            if (string.length() == 0) {
                z = true;
            }
            if (!z) {
                try {
                    HashMap hashMap2 = (HashMap) new Gson().A08(string, hashMap.getClass());
                    if (hashMap2 != null) {
                        return hashMap2;
                    }
                    return hashMap;
                } catch (C90063zm | IllegalStateException unused) {
                    C0w9.A03("UserPreferences", "Corrupted Nudge Tracker Map Data");
                    return hashMap;
                }
            }
        }
        A16(hashMap);
        return hashMap;
    }

    public final HashMap A0F() {
        HashMap hashMap = new HashMap();
        InterfaceC19630xq interfaceC19630xq = this.A01;
        String string = interfaceC19630xq.getString("supervision_upsell_eligibility", "");
        boolean z = true;
        C5KZ A00 = C5KX.A00(C25124B9u.A00, AbstractC73763Sg.A03);
        if (string != null && string.length() != 0) {
            z = false;
        }
        if (z) {
            String A02 = A00.A02(hashMap, new C73863Sv(C3RD.A01, C71744X0j.A00));
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7K("supervision_upsell_eligibility", A02);
            ARD.apply();
            return hashMap;
        }
        try {
            return (HashMap) A00.A00(string, new C73863Sv(C3RD.A01, C71744X0j.A00));
        } catch (C90063zm | IllegalStateException unused) {
            C0w9.A03("UserPreferences", "Corrupted Supervision Upsell Eligibility map data");
            return hashMap;
        }
    }

    public final List A0H() {
        return (List) new Gson().A07(new RW1(), this.A01.getString("share_to_whatsapp_reel_id_cache", null));
    }

    public final java.util.Set A0I(String str) {
        return this.A01.C2v(AnonymousClass001.A0R(str, "_limit_location_list"));
    }

    public final java.util.Set A0J(java.util.Set set) {
        java.util.Set stringSet = this.A01.getStringSet("do_not_translate_languages", set);
        if (stringSet != null) {
            return AbstractC001800i.A0j(stringSet);
        }
        return new LinkedHashSet();
    }

    public final void A0K() {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.EEj("has_seen_spend_x_get_y_coupon_received_on_ads_manager");
        ARD.apply();
    }

    public final void A0L() {
        InterfaceC19630xq interfaceC19630xq = this.A01;
        int i = interfaceC19630xq.getInt("moderator_role_nux_seen_count", 0);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        int i2 = i + 1;
        ARD.E7D("moderator_role_nux_seen_count", i2);
        ARD.apply();
        if (i2 >= 1) {
            this.A1v.Egi(this, true, A8c[446]);
        }
    }

    public final void A0R() {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77("has_used_shopping_bag", true);
        ARD.apply();
    }

    public final void A0T(int i) {
        InterfaceC19630xq interfaceC19630xq = this.A01;
        int i2 = interfaceC19630xq.getInt("comment_poll_consumption_footer_nux_seen_count", 0);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("comment_poll_consumption_footer_nux_seen_count", i2 + i);
        ARD.apply();
    }

    public final void A0U(int i) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D("browser_autofill_payment_decline_count", i);
        ARD.apply();
    }

    public final void A0V(int i) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D("browser_consecutive_decline_autofill", i);
        ARD.apply();
    }

    public final void A0W(int i) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D("encrypted_backups_pin_restore_visibility_count", i);
        ARD.apply();
    }

    public final void A0X(int i) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D("feed_fb_autoshare_upsell_dialog_display_count", i);
        ARD.apply();
    }

    public final void A0Y(int i) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D("feed_xpost_user_migration_upsell_second_wave_display_count", i);
        ARD.apply();
    }

    public final void A0Z(int i) {
        this.A6l.Egi(this, Integer.valueOf(i), A8c[477]);
    }

    public final void A0a(int i) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D("story_xpost_user_migration_upsell_second_wave_display_count", i);
        ARD.apply();
    }

    public final void A0b(int i) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D("xpost_unified_onboarding_upsell_display_count", i);
        ARD.apply();
    }

    public final void A0c(int i) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D("zero_rating_story_nux_count", i);
        ARD.apply();
    }

    public final void A0e(long j) {
        this.A12.Egi(this, Long.valueOf(j), A8c[1]);
    }

    public final void A0f(long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G("external_sharing_experiment_exposure_timestamp", j);
        ARD.apply();
    }

    public final void A0g(long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G("fb_feed_crossposting_toggle_tooltip_last_seen_time_in_ms", j);
        ARD.apply();
    }

    public final void A0h(long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G("feed_fb_autoshare_upsell_dialog_last_seen_sec", TimeUnit.MILLISECONDS.toSeconds(j));
        ARD.apply();
    }

    public final void A0i(long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G("feed_xpost_user_migration_upsell_second_wave_last_seen_sec", j);
        ARD.apply();
    }

    public final void A0j(long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G("reel_one_tap_fbshare_tooltip_last_seen_sec", TimeUnit.MILLISECONDS.toSeconds(j));
        ARD.apply();
    }

    public final void A0k(long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G("direct_message_mute_all_timestamp", j);
        ARD.apply();
    }

    public final void A0l(long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G("story_xpost_user_migration_upsell_second_wave_last_seen_sec", j);
        ARD.apply();
    }

    public final void A0m(long j) {
        InterfaceC19630xq interfaceC19630xq = this.A01;
        int i = interfaceC19630xq.getInt("take_a_break_nudge_last_seen_count", 0);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G(AnonymousClass001.A0O("take_a_break_nudge_last_seen_time_prefix_", i), j);
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7D("take_a_break_nudge_last_seen_count", i + 1);
        ARD2.apply();
    }

    public final void A0n(long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G("xpost_unified_onboarding_upsell_last_seen_sec", j);
        ARD.apply();
    }

    public final void A0r(String str) {
        java.util.Set hashSet;
        InterfaceC19630xq interfaceC19630xq = this.A01;
        if (interfaceC19630xq.contains("profile_pending_hide_or_remove_medias")) {
            hashSet = AbstractC001800i.A0j(interfaceC19630xq.C2v("profile_pending_hide_or_remove_medias"));
        } else {
            hashSet = new HashSet();
        }
        hashSet.remove(str);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7L("profile_pending_hide_or_remove_medias", hashSet);
        ARD.apply();
    }

    public final void A0s(String str) {
        this.A0L.Egi(this, str, A8c[139]);
    }

    public final void A0t(String str) {
        this.A0R.Egi(this, str, A8c[46]);
    }

    public final void A0u(String str) {
        this.A1A.Egi(this, str, A8c[379]);
    }

    public final void A0w(String str) {
        this.A6D.Egi(this, str, A8c[402]);
    }

    public final void A0y(String str) {
        this.A8G.Egi(this, str, A8c[60]);
    }

    public final void A0z(String str, int i) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7D(str, i);
        ARD.apply();
    }

    public final void A11(String str, long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G(str, j);
        ARD.apply();
    }

    public final void A12(String str, String str2) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7K(str, str2);
        ARD.apply();
    }

    public final void A13(String str, boolean z) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77(str, z);
        ARD.apply();
    }

    public final void A16(HashMap hashMap) {
        String A0B = new Gson().A0B(hashMap);
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7K("nudge_tracker_map", A0B);
        ARD.apply();
    }

    public final void A17(HashMap hashMap) {
        String A02 = C5KX.A00(C25125B9v.A00, AbstractC73763Sg.A03).A02(hashMap, new C73863Sv(C3RD.A01, C71744X0j.A00));
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7K("supervision_upsell_eligibility", A02);
        ARD.apply();
    }

    public final void A18(List list) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7K("sticker_tray_search_history", new Gson().A0B(list));
        ARD.apply();
    }

    public final void A1A(java.util.Set set) {
        InterfaceC19630xq interfaceC19630xq = this.A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.EEj("do_not_translate_languages");
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7L("do_not_translate_languages", set);
        ARD2.apply();
    }

    public final void A1B(boolean z) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77("allow_contacts_sync", z);
        ARD.apply();
    }

    public final void A1C(boolean z) {
        this.A0C.Egi(this, Boolean.valueOf(z), A8c[233]);
    }

    public final void A1D(boolean z) {
        this.A0D.Egi(this, Boolean.valueOf(z), A8c[64]);
    }

    public final void A1E(boolean z) {
        this.A60.Egi(this, Boolean.valueOf(z), A8c[70]);
    }

    public final void A1F(boolean z) {
        this.A0G.Egi(this, Boolean.valueOf(z), A8c[130]);
    }

    public final void A1G(boolean z) {
        this.A0M.Egi(this, Boolean.valueOf(z), A8c[165]);
    }

    public final void A1H(boolean z) {
        this.A0O.Egi(this, Boolean.valueOf(z), A8c[167]);
    }

    public final void A1I(boolean z) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77("has_cancelled_reels_auto_scroll", z);
        ARD.apply();
    }

    public final void A1J(boolean z) {
        this.A62.Egi(this, Boolean.valueOf(z), A8c[486]);
    }

    public final void A1K(boolean z) {
        this.A14.Egi(this, Boolean.valueOf(z), A8c[388]);
    }

    public final void A1L(boolean z) {
        this.A1B.Egi(this, Boolean.valueOf(z), A8c[132]);
    }

    public final void A1M(boolean z) {
        this.A1d.Egi(this, Boolean.valueOf(z), A8c[381]);
    }

    public final void A1N(boolean z) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77("has_denied_full_ci_nux", z);
        ARD.apply();
    }

    public final void A1O(boolean z) {
        this.A26.Egi(this, Boolean.valueOf(z), A8c[54]);
    }

    public final void A1P(boolean z) {
        this.A2H.Egi(this, Boolean.valueOf(z), A8c[81]);
    }

    public final void A1Q(boolean z) {
        this.A2V.Egi(this, Boolean.valueOf(z), A8c[53]);
    }

    public final void A1R(boolean z) {
        this.A2v.Egi(this, Boolean.valueOf(z), A8c[162]);
    }

    public final void A1S(boolean z) {
        this.A3K.Egi(this, Boolean.valueOf(z), A8c[320]);
    }

    public final void A1T(boolean z) {
        this.A3R.Egi(this, Boolean.valueOf(z), A8c[55]);
    }

    public final void A1U(boolean z) {
        this.A3d.Egi(this, Boolean.valueOf(z), A8c[436]);
    }

    public final void A1V(boolean z) {
        this.A47.Egi(this, Boolean.valueOf(z), A8c[481]);
    }

    public final void A1W(boolean z) {
        this.A48.Egi(this, Boolean.valueOf(z), A8c[478]);
    }

    public final void A1X(boolean z) {
        this.A4K.Egi(this, Boolean.valueOf(z), A8c[439]);
    }

    public final void A1Y(boolean z) {
        this.A4T.Egi(this, Boolean.valueOf(z), A8c[82]);
    }

    public final void A1Z(boolean z) {
        this.A5P.Egi(this, Boolean.valueOf(z), A8c[52]);
    }

    public final void A1a(boolean z) {
        this.A5S.Egi(this, Boolean.valueOf(z), A8c[329]);
    }

    public final void A1b(boolean z) {
        InterfaceC19630xq interfaceC19630xq = this.A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E77("is_presence_enabled", z);
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7G("presence_last_set", System.currentTimeMillis());
        ARD2.apply();
    }

    public final void A1c(boolean z) {
        this.A6c.Egi(this, Boolean.valueOf(z), A8c[67]);
    }

    public final void A1d(boolean z) {
        this.A7u.Egi(this, Boolean.valueOf(z), A8c[308]);
    }

    public final void A1e(boolean z) {
        this.A7w.Egi(this, Boolean.valueOf(z), A8c[509]);
    }

    public final void A1f(boolean z) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77("translate_stickers", z);
        ARD.apply();
    }

    public final void A1g(boolean z) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77("oxp_show_app_update_available_notifications", z);
        ARD.apply();
    }

    public final void A1h(boolean z) {
        this.A7y.Egi(this, Boolean.valueOf(z), A8c[141]);
    }

    public final boolean A1i() {
        return ((Boolean) this.A0C.CES(this, A8c[233])).booleanValue();
    }

    public final boolean A1j() {
        return ((Boolean) this.A0G.CES(this, A8c[130])).booleanValue();
    }

    public final boolean A1k() {
        return ((Boolean) this.A0H.CES(this, A8c[367])).booleanValue();
    }

    public final boolean A1l() {
        return ((Boolean) this.A0T.CES(this, A8c[144])).booleanValue();
    }

    public final boolean A1m() {
        return ((Boolean) this.A0z.CES(this, A8c[335])).booleanValue();
    }

    public final boolean A1n() {
        return ((Boolean) this.A1d.CES(this, A8c[381])).booleanValue();
    }

    public final boolean A1o() {
        return ((Boolean) this.A2W.CES(this, A8c[382])).booleanValue();
    }

    public final boolean A1p() {
        return ((Boolean) this.A2x.CES(this, A8c[323])).booleanValue();
    }

    public final boolean A1q() {
        return ((Boolean) this.A4T.CES(this, A8c[82])).booleanValue();
    }

    public final boolean A1r() {
        return ((Boolean) this.A4s.CES(this, A8c[123])).booleanValue();
    }

    public final boolean A1s() {
        return ((Boolean) this.A5C.CES(this, A8c[310])).booleanValue();
    }

    public final boolean A1t() {
        return ((Boolean) this.A5K.CES(this, A8c[414])).booleanValue();
    }

    public final boolean A1u() {
        InterfaceC19630xq interfaceC19630xq = this.A01;
        if (interfaceC19630xq.contains("checkout_awareness_interstitial_shown_count_pdp") || interfaceC19630xq.contains("checkout_awareness_interstitial_shown_count_drops_pdp") || interfaceC19630xq.contains("checkout_awareness_interstitial_shown_count_shop_home") || interfaceC19630xq.contains("checkout_awareness_interstitial_shown_count_shopping_bag")) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E77("has_shown_checkout_awareness_interstitial", true);
            ARD.apply();
            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
            ARD2.EEj("checkout_awareness_interstitial_shown_count_pdp");
            ARD2.apply();
            InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
            ARD3.EEj("checkout_awareness_interstitial_shown_count_drops_pdp");
            ARD3.apply();
            InterfaceC19610xo ARD4 = interfaceC19630xq.ARD();
            ARD4.EEj("checkout_awareness_interstitial_shown_count_shop_home");
            ARD4.apply();
            InterfaceC19610xo ARD5 = interfaceC19630xq.ARD();
            ARD5.EEj("checkout_awareness_interstitial_shown_count_shopping_bag");
            ARD5.apply();
            InterfaceC19610xo ARD6 = interfaceC19630xq.ARD();
            ARD6.EEj("checkout_awareness_interstitial_last_shown_time_ms");
            ARD6.apply();
        }
        return interfaceC19630xq.getBoolean("has_shown_checkout_awareness_interstitial", false);
    }

    public final boolean A1v() {
        return ((Boolean) this.A6c.CES(this, A8c[67])).booleanValue();
    }

    public final boolean A1w() {
        boolean z = this.A01.getBoolean("quick_capture_open_with_front_camera", false);
        if (z) {
            if (!A1v()) {
                A1c(true);
            }
            InterfaceC16530ry interfaceC16530ry = this.A0y;
            C0YR[] c0yrArr = A8c;
            if (!((Boolean) interfaceC16530ry.CES(this, c0yrArr[68])).booleanValue()) {
                interfaceC16530ry.Egi(this, true, c0yrArr[68]);
            }
        }
        return z;
    }

    public final boolean A1x() {
        return ((Boolean) this.A7F.CES(this, A8c[32])).booleanValue();
    }

    public final boolean A1y() {
        return ((Boolean) this.A60.CES(this, A8c[70])).booleanValue();
    }

    public final boolean A1z() {
        return ((Boolean) this.A61.CES(this, A8c[297])).booleanValue();
    }

    public final boolean A20() {
        if (1 != this.A01.getInt("high_quality_media_upload", 0)) {
            return false;
        }
        return true;
    }

    public final boolean A21() {
        return ((Boolean) this.A68.CES(this, A8c[428])).booleanValue();
    }

    public final boolean A22() {
        return this.A01.getBoolean("is_presence_enabled", true);
    }

    public /* synthetic */ C23031Ai(UserSession userSession) {
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A3X, C23031Ai.class);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A04, 2);
        this.A00 = userSession;
        this.A01 = A04;
        this.A37 = AbstractC19590xm.A06(A04, "disappearing_messages_bottomsheet_nux_shown", false);
        this.A12 = AbstractC19590xm.A02(A04, "disappering_messages_latest_nux_content_seen_version", 0L, false);
        this.A13 = AbstractC19590xm.A06(A04, "disappering_messages_user_device_received_e2ee_attribution", false);
        this.A0K = AbstractC19590xm.A03(A04, "blacklist_search_ids", null);
        this.A6w = AbstractC19590xm.A02(A04, "notification_last_received", 0L, false);
        this.A6v = AbstractC19590xm.A02(A04, "recent_items_last_sycned_timestamp_ms", 0L, false);
        this.A7n = AbstractC19590xm.A02(A04, "recent_shopping_items_last_synced_timestamp_ms", 0L, false);
        this.A6U = AbstractC19590xm.A02(A04, "recent_map_items_last_synced_timestamp_ms", 0L, false);
        this.A75 = AbstractC19590xm.A03(A04, "recent_user_searches", null);
        this.A76 = AbstractC19590xm.A03(A04, "recent_user_searches_with_ts", null);
        this.A77 = AbstractC19590xm.A03(A04, "recent_tagged_users", null);
        this.A6z = AbstractC19590xm.A03(A04, "recent_hashtag_searches_with_ts", null);
        this.A74 = AbstractC19590xm.A03(A04, "recent_place_searces", null);
        this.A70 = AbstractC19590xm.A03(A04, "recent_keyword_searches_with_ts", null);
        this.A6x = AbstractC19590xm.A03(A04, "recent_audio_searches_with_ts", null);
        this.A6y = AbstractC19590xm.A03(A04, "recent_effect_searches", null);
        this.A72 = AbstractC19590xm.A03(A04, "recent_map_location_searches_with_ts", null);
        this.A71 = AbstractC19590xm.A03(A04, "recent_map_hashtag_searches_with_ts", null);
        this.A73 = AbstractC19590xm.A03(A04, "recent_map_query_searches_with_ts", null);
        this.A3l = AbstractC19590xm.A06(A04, "layout_v2_nux_seen", false);
        this.A3p = AbstractC19590xm.A06(A04, "clips_longer_duration_nux_seen", false);
        this.A1f = AbstractC19590xm.A06(A04, "has_accepted_tifu_a_likes_nux", false);
        this.A1G = AbstractC19590xm.A01(A04, "pref_feta_upgrade", -1);
        this.A1H = AbstractC19590xm.A02(A04, "pref_feta_upgrade_timestamp", 0L, false);
        this.A0a = AbstractC19590xm.A03(A04, "clips_draft_reminder_notification_draft_id", null);
        this.A1I = AbstractC19590xm.A04(A04, "has_flash_on", "off");
        this.A4l = AbstractC19590xm.A06(A04, "reels_multitouch_nux_seen", false);
        this.A4B = AbstractC19590xm.A06(A04, "seen_nine_sixteen_tooltip", false);
        this.A7q = AbstractC19590xm.A06(A04, "generate_captions_for_dovetail_video", true);
        this.A7p = AbstractC19590xm.A06(A04, "generate_captions_for_story_videos", false);
        this.A2M = AbstractC19590xm.A06(A04, "has_seen_auto_translated_disclaimer", false);
        this.A7r = AbstractC19590xm.A06(A04, "save_captured_videos", true);
        this.A7F = AbstractC19590xm.A06(A04, "save_original_photos", true);
        this.A7G = AbstractC19590xm.A06(A04, "save_posted_photos", true);
        this.A7D = AbstractC19590xm.A06(A04, "render_gallery", true);
        this.A7C = AbstractC19590xm.A06(A04, "render_blur_icons", true);
        this.A4j = AbstractC19590xm.A06(A04, "seen_renux_experience", false);
        this.A7o = AbstractC19590xm.A06(A04, "should_default_to_reels", false);
        this.A69 = AbstractC19590xm.A06(A04, "rageshake_v2_enabled", true);
        this.A0W = AbstractC19590xm.A03(A04, "casper_target_event_timestamps", null);
        this.A0V = AbstractC19590xm.A03(A04, "casper_pending_trigger_event_timestamps_2", null);
        this.A83 = AbstractC19590xm.A03(A04, "signals_clips_sessions_timestamps", null);
        this.A82 = AbstractC19590xm.A03(A04, "signals_clips_comments_open_timestamps", null);
        this.A84 = AbstractC19590xm.A03(A04, "signals_clips_tab_open_timestamps", null);
        this.A85 = AbstractC19590xm.A03(A04, "signals_explore_sessions_timestamps", null);
        this.A81 = AbstractC19590xm.A03(A04, "signals_clips_audio_page_open_timestamps", null);
        this.A0R = AbstractC19590xm.A03(A04, "story_btp_timestamps", null);
        this.A0Q = AbstractC19590xm.A03(A04, "feed_btp_timestamps", null);
        this.A8D = AbstractC19590xm.A03(A04, "surface_usage_record", null);
        this.A3q = AbstractC19590xm.A06(A04, "low_light_mode_nux_tooltip", false);
        this.A4F = AbstractC19590xm.A06(A04, "clips_spin_creation_nux_seen", false);
        this.A4G = AbstractC19590xm.A06(A04, "clips_spin_participation_nux_seen", false);
        this.A5P = AbstractC19590xm.A06(A04, "magic_media_remix_try_it_nux_seen", false);
        this.A2V = AbstractC19590xm.A06(A04, "magic_media_remix_camera_consent_nux_seen", false);
        this.A26 = AbstractC19590xm.A06(A04, "magic_media_remix_acknowledgement_nux_seen", false);
        this.A3R = AbstractC19590xm.A06(A04, "magic_media_remix_full_access_settings_nux_seen", false);
        this.A6S = AbstractC19590xm.A06(A04, "magic_media_remix_not_now_clicked", false);
        this.A5M = AbstractC19590xm.A06(A04, "text_emphasis_tool_apply_outlines_nux_reels", false);
        this.A5N = AbstractC19590xm.A06(A04, "text_emphasis_tool_apply_outlines_nux_stories", false);
        this.A6b = AbstractC19590xm.A01(A04, "text_new_font_badge_nux", 0);
        this.A8G = AbstractC19590xm.A03(A04, "precapture_text_format_id", null);
        this.A8F = AbstractC19590xm.A03(A04, "text_to_camera_emphasis_mode", null);
        this.A8E = AbstractC19590xm.A01(A04, "text_to_camera_colour_id", -1);
        this.A8H = AbstractC19590xm.A00(A04, "text_to_camera_size_ratio", -1.0f);
        this.A0D = AbstractC19590xm.A06(A04, "allow_story_reshare", true);
        this.A7f = AbstractC19590xm.A03(A04, "seen_state", null);
        this.A6j = AbstractC19590xm.A03(A04, "per_media_seen_state", null);
        this.A6c = AbstractC19590xm.A06(A04, "quick_capture_front_camera", true);
        this.A0y = AbstractC19590xm.A06(A04, "direct_front_camera", true);
        this.A3k = AbstractC19590xm.A06(A04, "has_seen_interactive_sticker_upsell_tooltip", false);
        this.A60 = AbstractC19590xm.A06(A04, "oxp_allow_app_updates", true);
        this.A4J = AbstractC19590xm.A06(A04, "seen_offline_like_nux", false);
        this.A50 = AbstractC19590xm.A06(A04, "seen_share_button_reenabled_nux", false);
        this.A3L = AbstractC19590xm.A06(A04, "seen_feed_quick_send_nux", false);
        this.A2G = AbstractC19590xm.A06(A04, "seen_ai_rewrite_tooltip", false);
        this.A2E = AbstractC19590xm.A06(A04, "seen_ai_filter_tooltip", false);
        this.A2F = AbstractC19590xm.A06(A04, "seen_ai_rewrite_nux", false);
        this.A3y = AbstractC19590xm.A06(A04, "seen_memu_tool_tip", false);
        this.A3h = AbstractC19590xm.A06(A04, "has_seen_imagine_sticker_tray_discard_media_dialog", false);
        this.A2m = AbstractC19590xm.A06(A04, "seen_clips_quick_send_nux", false);
        this.A2A = AbstractC19590xm.A06(A04, "seen_add_to_profile_nux", false);
        this.A2H = AbstractC19590xm.A06(A04, "seen_also_share_to_nux", false);
        this.A4T = AbstractC19590xm.A06(A04, "seen_overflow_menu_also_share_to_nux", false);
        this.A3M = AbstractC19590xm.A06(A04, "seen_feed_quick_send_window", false);
        this.A2n = AbstractC19590xm.A06(A04, "seen_clips_quick_send_window", false);
        this.A8O = AbstractC19590xm.A06(A04, "user_has_double_tapped_to_like_comment", false);
        this.A1x = AbstractC19590xm.A06(A04, "done_longpress_on_comment_action", false);
        this.A4N = AbstractC19590xm.A06(A04, "seen_open_carousel_creator_education_sheet_nux_1", false);
        this.A4O = AbstractC19590xm.A06(A04, "seen_open_carousel_submitter_education_sheet_nux_1", false);
        this.A4M = AbstractC19590xm.A06(A04, "seen_open_carousel_approval_sheet_nux_1", false);
        this.A6f = AbstractC19590xm.A01(A04, "open_carousel_turn_on_cta_banner_seen_count", 0);
        this.A6e = AbstractC19590xm.A02(A04, "open_carousel_turn_on_cta_banner_last_seen_ms", 0L, false);
        this.A6g = AbstractC19590xm.A01(A04, "open_carousel_turn_on_menu_new_badge_seen_count_1", 0);
        this.A4P = AbstractC19590xm.A06(A04, "has_seen_open_carousel_thank_nux", false);
        this.A0l = AbstractC19590xm.A01(A04, "collaborators_bottom_sheet_nux_seen_count", 0);
        this.A0k = AbstractC19590xm.A06(A04, "collab_consumption_education_bottom_sheet_banner_dismissed", false);
        this.A4H = AbstractC19590xm.A06(A04, "seen_offline_comment_nux", false);
        this.A2u = AbstractC19590xm.A06(A04, "seen_comment_reply_surface_nux", false);
        this.A4I = AbstractC19590xm.A06(A04, "seen_offline_follow_nux", false);
        this.A1y = AbstractC19590xm.A06(A04, "has_enabled_nametag_background_image_blur", false);
        this.A1z = AbstractC19590xm.A06(A04, "has_enabled_nametag_background_image_download", false);
        this.A43 = AbstractC19590xm.A06(A04, "seen_nametag", false);
        this.A44 = AbstractC19590xm.A06(A04, "seen_nametag_nux_tutorial", false);
        this.A46 = AbstractC19590xm.A06(A04, "seen_nametag_story_camera_nux", false);
        this.A45 = AbstractC19590xm.A06(A04, "seen_nametag_selfie_camera_nux", false);
        this.A3P = AbstractC19590xm.A06(A04, "seen_filter_button_nux", false);
        this.A3Q = AbstractC19590xm.A06(A04, "seen_filter_with_label_button_nux", false);
        this.A3D = AbstractC19590xm.A06(A04, "seen_expiring_media_message_in_thread_tooltip", false);
        this.A49 = AbstractC19590xm.A06(A04, "seen_newsfeed_hide_story_tooltip", false);
        this.A4A = AbstractC19590xm.A06(A04, "seen_newsfeed_hide_story_dialog", false);
        this.A4d = AbstractC19590xm.A06(A04, "seen_promote_new_user_tooltip", false);
        this.A2B = AbstractC19590xm.A06(A04, "seen_aggregate_promote_engagement_nux", false);
        this.A6O = AbstractC19590xm.A06(A04, "live_has_seen_close_friends_tooltip_when_selected_from_audience_bottomsheet", false);
        this.A40 = AbstractC19590xm.A06(A04, "preference_has_seen_message_extension_tooltip", false);
        this.A2U = AbstractC19590xm.A06(A04, "preference_has_seen_ctxmd_tooltip", false);
        this.A6N = AbstractC19590xm.A06(A04, "live_has_enabled_trivia_before", false);
        this.A6M = AbstractC19590xm.A06(A04, "live_has_enabled_this_or_that_before", false);
        this.A6L = AbstractC19590xm.A06(A04, "live_has_enabled_close_up_before", false);
        this.A6P = AbstractC19590xm.A06(A04, "live_has_seen_close_friends_viewer_privacy_disclosure", false);
        this.A6Q = AbstractC19590xm.A06(A04, "live_viewer_picture_in_picture_should_show_opt_in_dialog", true);
        this.A6R = AbstractC19590xm.A06(A04, "live_viewer_picture_in_picture_should_show_toggle_tool_tip", true);
        this.A5l = AbstractC19590xm.A06(A04, "has_tapped_on_live_media_picker", false);
        this.A4t = AbstractC19590xm.A06(A04, "has_seen_sup_use_glasses_tooltip", false);
        this.A4s = AbstractC19590xm.A06(A04, "has_seen_sup_privacy_bottom_sheet", false);
        this.A1n = AbstractC19590xm.A06(A04, "has_denied_sup_permission", false);
        this.A1o = AbstractC19590xm.A06(A04, "has_denied_sup_toolkit_permission", false);
        this.A4r = AbstractC19590xm.A06(A04, "has_seen_sup_double_press_prompt_on_connected", false);
        this.A4u = AbstractC19590xm.A06(A04, "seen_save_reel_tooltip", false);
        this.A41 = AbstractC19590xm.A06(A04, "seen_multi_author_story_view_count_nux", false);
        this.A4W = AbstractC19590xm.A06(A04, "has_seen_pics_please_extended_disclaimer", false);
        this.A0G = AbstractC19590xm.A06(A04, "auto_save_reel_media_to_gallery", false);
        this.A0F = AbstractC19590xm.A06(A04, "auto_save_clips_media_to_gallery", false);
        this.A1B = AbstractC19590xm.A06(A04, "auto_cross_post_to_facebook_story", false);
        this.A6Z = AbstractC19590xm.A02(A04, "music_pick_template_new_sticker_time_stamp", 0L, false);
        this.A1m = AbstractC19590xm.A06(A04, "has_creator_seen_messaging_nux", false);
        this.A0U = AbstractC19590xm.A06(A04, "can_use_branded_content", false);
        this.A6i = AbstractC19590xm.A03(A04, "partner_program_next_step", null);
        this.A8P = AbstractC19590xm.A03(A04, "user_pay_next_step", null);
        this.A05 = AbstractC19590xm.A03(A04, "affiliate_next_step", null);
        this.A0L = AbstractC19590xm.A03(A04, "branded_content_eligibility_decision", "not_eligible");
        this.A5v = AbstractC19590xm.A03(A04, "igtv_revshare_next_step", null);
        this.A7y = AbstractC19590xm.A06(A04, "show_business_welcome_dialog", false);
        this.A42 = AbstractC19590xm.A06(A04, "my_week_consumption_nux_seen", false);
        this.A80 = AbstractC19590xm.A06(A04, "show_recycling_bin_dialog", true);
        this.A0T = AbstractC19590xm.A06(A04, "show_stories_insights", true);
        this.A4b = AbstractC19590xm.A06(A04, "has_seen_profile_ix_cta_nux", false);
        this.A5B = AbstractC19590xm.A06(A04, "seen_story_branded_content_tagging_upsell_tooltip", false);
        this.A2Q = AbstractC19590xm.A06(A04, "seen_story_branded_content_insights_disclosure_dialog", false);
        this.A7x = AbstractC19590xm.A06(A04, "show_book_option_spinner", false);
        this.A1C = AbstractC19590xm.A06(A04, "feed_overlay_dev", false);
        this.A1D = AbstractC19590xm.A06(A04, "feed_litho_coalesced_dev", false);
        this.A21 = AbstractC19590xm.A06(A04, "has_gone_live", false);
        this.A25 = AbstractC19590xm.A06(A04, "has_saved_media", false);
        this.A2w = AbstractC19590xm.A06(A04, "has_seen_content_scheduling_upsell", false);
        this.A33 = AbstractC19590xm.A06(A04, "has_seen_daisy_creation_nux", false);
        this.A5t = AbstractC19590xm.A06(A04, "hide_likes_and_view_counts_in_consumption", false);
        this.A5x = AbstractC19590xm.A03(A04, "insights_thrift_client", null);
        this.A0x = AbstractC19590xm.A03(A04, "direct_reaction_set", null);
        this.A0w = AbstractC19590xm.A03(A04, "direct_double_tap_emoji_reaction", null);
        this.A11 = AbstractC19590xm.A01(A04, "direct_reactions_swipe_to_see_more_nux_count", 0);
        this.A4c = AbstractC19590xm.A06(A04, "has_seen_profile_pinned_highlights_nux", false);
        this.A34 = AbstractC19590xm.A06(A04, "has_seen_delete_or_hide_dialog", false);
        this.A2v = AbstractC19590xm.A06(A04, "seen_contact_import_dialog", false);
        this.A3H = AbstractC19590xm.A06(A04, "seen_facebook_connect_dialog", false);
        this.A0N = AbstractC19590xm.A06(A04, "browser_autofill_contact_synced", false);
        this.A0M = AbstractC19590xm.A06(A04, "browser_autofill_consent_accepted", false);
        this.A0P = AbstractC19590xm.A01(A04, "BrowserLiteIntent.EXTRA_AUTOFILL_SUPPRESS_NUX_EXPERIMENT_VERSION_ID", 0);
        this.A0O = AbstractC19590xm.A06(A04, "browser_autofill_payment_opt_in", false);
        this.A7E = AbstractC19590xm.A06(A04, "safe_browsing_opt_in", true);
        this.A0j = AbstractC19590xm.A06(A04, "close_friends_gallery_picker_upsell_dialog_seen_v2", false);
        this.A2K = AbstractC19590xm.A06(A04, "has_seen_audience_lists_nux_tooltip", false);
        this.A4a = AbstractC19590xm.A06(A04, "has_seen_private_stroy_share_sheet_tooltip", false);
        this.A3a = AbstractC19590xm.A06(A04, "has_seen_hall_pass_one_time_disclosure", false);
        this.A3Z = AbstractC19590xm.A06(A04, "has_seen_hall_pass_creation_nux_dialog", false);
        this.A3Y = AbstractC19590xm.A06(A04, "has_seen_hall_pass_consumption_nux_dialog", false);
        this.A59 = AbstractC19590xm.A06(A04, "stories_template_background_and_or_music_pinning_nux_dialog", false);
        this.A09 = AbstractC19590xm.A06(A04, "allow_expired_replays", false);
        this.A16 = AbstractC19590xm.A06(A04, "enable_stories_loading_visualization", false);
        this.A6t = AbstractC19590xm.A03(A04, "realtime_mqtt_request_routing_region", null);
        this.A8b = AbstractC19590xm.A03(A04, "zero_cms_locale", null);
        this.A8a = AbstractC19590xm.A03(A04, "zero_cms_data", null);
        this.A7k = AbstractC19590xm.A06(A04, "clips_share_sheet_topics_tagging_tooltip", false);
        this.A7i = AbstractC19590xm.A06(A04, "clips_share_sheet_audience_control_row_tooltip_shown", false);
        this.A1F = AbstractC19590xm.A06(A04, "feed_share_sheet_audience_control_row_tooltip_shown", false);
        this.A7j = AbstractC19590xm.A06(A04, "share_sheet_audience_control_visible_comment_dialog", false);
        this.A0f = AbstractC19590xm.A06(A04, "clips_share_sheet_product_tag_row_tooltip", false);
        this.A0e = AbstractC19590xm.A06(A04, "clips_share_sheet_meta_verified_add_link_new_badge_tapped", false);
        this.A0c = AbstractC19590xm.A06(A04, "clips_share_sheet_audio_translations_row_tapped", false);
        this.A0h = AbstractC19590xm.A06(A04, "clips_sticker_translations_opt_in_tapped", false);
        this.A2c = AbstractC19590xm.A06(A04, "has_seen_clips_audio_translations_consent_nux_and_opted_in", false);
        this.A0d = AbstractC19590xm.A06(A04, "clips_share_sheet_exclusive_content_row_tooltip", false);
        this.A0g = AbstractC19590xm.A06(A04, "clips_share_sheet_template_opt_in_row_tooltip", false);
        this.A6h = AbstractC19590xm.A06(A04, "panavision_profile_entry_reels_posted", false);
        this.A3z = AbstractC19590xm.A06(A04, "mentioned_user_reshare_tooltip", false);
        this.A5I = AbstractC19590xm.A06(A04, "preference_story_template_pinned_mention_tooltip", false);
        this.A2b = AbstractC19590xm.A06(A04, "clips_has_seen_audience_control_bottomsheet_tooltip", false);
        this.A4e = AbstractC19590xm.A06(A04, "clips_has_seen_public_account_followers_only_bottomsheet_tooltip", false);
        this.A5F = AbstractC19590xm.A06(A04, "story_question_responders_nux_tooltip", false);
        this.A5G = AbstractC19590xm.A06(A04, "story_quiz_responders_nux_tooltip", false);
        this.A5H = AbstractC19590xm.A06(A04, "story_slider_voters_nux_tooltip", false);
        this.A63 = AbstractC19590xm.A06(A04, "is_copresence_enabled", true);
        this.A1s = AbstractC19590xm.A06(A04, "fb_feed_crossposting_like_sheet_upsell_has_dismissed", false);
        this.A67 = AbstractC19590xm.A06(A04, "upsells_eligibility_for_link_switcher_reset", false);
        this.A3f = AbstractC19590xm.A06(A04, "has_seen_highlight_rewinds_nux_tooltip", false);
        this.A03 = AbstractC19590xm.A02(A04, "add_yours_nux_dialog_seen_ts", 0L, false);
        this.A04 = AbstractC19590xm.A02(A04, "add_yours_tool_tip_seen_ts", 0L, false);
        this.A3n = AbstractC19590xm.A06(A04, "has_seen_location_sharing_nux_dialog", false);
        this.A5A = AbstractC19590xm.A06(A04, "story_has_seen_stories_template_music_pinning_tooltip", false);
        this.A1w = AbstractC19590xm.A06(A04, "story_has_dismissed_stories_template_camera_tool_new_badge", false);
        this.A88 = AbstractC19590xm.A01(A04, "stories_template_camera_tool_new_badge_impression_count", 0);
        this.A4X = AbstractC19590xm.A06(A04, "preference_has_seen_post_reel_parity_edit_tooltip", false);
        this.A87 = AbstractC19590xm.A03(A04, "sticky_archive_home_mode", null);
        this.A24 = AbstractC19590xm.A06(A04, "has_pinched_to_zoom_landscape", false);
        this.A7s = AbstractC19590xm.A06(A04, "should_show_add_interests_tooltip", true);
        this.A5f = AbstractC19590xm.A06(A04, "group_profile_has_tapped_creation_menu_option", false);
        this.A5g = AbstractC19590xm.A06(A04, "group_profile_has_tapped_profile_menu_option", false);
        this.A2P = AbstractC19590xm.A06(A04, "barcelona_share_to_story_color_picker_nux_seen", false);
        this.A2O = AbstractC19590xm.A06(A04, "barcelona_app_switcher_self_profile_nux_seen", false);
        this.A2N = AbstractC19590xm.A06(A04, "barcelona_app_switcher_other_profile_nux_seen", false);
        this.A2i = AbstractC19590xm.A06(A04, "clips_notify_me_sticker_nux_seen", false);
        this.A2f = AbstractC19590xm.A06(A04, "clips_gen_ai_more_menu_tooltip_seen", false);
        this.A4Y = AbstractC19590xm.A06(A04, "posts_gen_ai_sharesheet_tooltip_seen", false);
        this.A5h = AbstractC19590xm.A06(A04, "meta_verified_has_tapped_profile_menu_option", false);
        this.A5c = AbstractC19590xm.A06(A04, "channels_has_tapped_channels_creation", false);
        this.A2Z = AbstractC19590xm.A06(A04, "has_seen_channels_creation_tooltip", false);
        this.A2a = AbstractC19590xm.A06(A04, "has_seen_channels_creation_v2_tooltip", false);
        this.A5d = AbstractC19590xm.A06(A04, "channels_has_tapped_channels_inbox_directory", false);
        this.A4f = AbstractC19590xm.A06(A04, "group_profile_public_has_seen_new_member_nux", false);
        this.A4Z = AbstractC19590xm.A06(A04, "group_profile_private_has_seen_request_nux", false);
        this.A4z = AbstractC19590xm.A06(A04, "has_seen_send_controls_tooltip", false);
        this.A1b = AbstractC19590xm.A06(A04, "has_acknowledged_direct_sharesheet_repost_nux", false);
        this.A1l = AbstractC19590xm.A06(A04, "has_created_messenger_room", false);
        this.A65 = AbstractC19590xm.A06(A04, "is_eligible_for_integrity_verification", false);
        this.A0C = AbstractC19590xm.A06(A04, "allow_story_mention_sharing", true);
        this.A0B = AbstractC19590xm.A06(A04, "allow_story_mention_group_thread_creation", false);
        this.A5E = AbstractC19590xm.A06(A04, "story_mention_group_thread_creation_nux", false);
        this.A0A = AbstractC19590xm.A06(A04, "allow_story_countdown_follow_and_sharing", true);
        this.A6u = AbstractC19590xm.A03(A04, "direct_blast_list_candidates", null);
        this.A1X = AbstractC19590xm.A06(A04, "group_effects_tab_badge_clicked", false);
        this.A8R = AbstractC19590xm.A06(A04, "video_call_screen_share_nux_shown", false);
        this.A0S = AbstractC19590xm.A06(A04, "business_profile_calling_bottom_sheet_shown", false);
        this.A7l = AbstractC19590xm.A03(A04, "share_to_fb_settings", null);
        this.A3J = AbstractC19590xm.A06(A04, "seen_facebook_story_dialog", false);
        this.A3I = AbstractC19590xm.A06(A04, "seen_facebook_story", false);
        this.A8S = AbstractC19590xm.A03(A04, "viper_2m_config", null);
        this.A18 = AbstractC19590xm.A03(A04, "explore_shimmer_grid_layout", null);
        this.A7H = AbstractC19590xm.A03(A04, "preference_search_null_state_dynamic_sections", null);
        this.A7I = AbstractC19590xm.A03(A04, "preference_search_null_state_search_box_suggestions", null);
        this.A0n = AbstractC19590xm.A06(A04, "igtv_composer_aspect_ratio_nux_seen", false);
        this.A5X = AbstractC19590xm.A06(A04, "user_has_sent_batch_invite", false);
        this.A5Y = AbstractC19590xm.A06(A04, "user_has_sent_contact_invite", false);
        this.A7B = AbstractC19590xm.A03(A04, "remaining_nux_steps", null);
        this.A7m = AbstractC19590xm.A03(A04, "shopping_bundled_notification_prototype_experience", null);
        this.A0m = AbstractC19590xm.A03(A04, "comment_warning_session_id", null);
        this.A0X = AbstractC19590xm.A03(A04, "client_config_realtime_update_settings", null);
        this.A5Z = AbstractC19590xm.A06(A04, "suggested_users_shuffle_button_tooltip_shown", false);
        this.A78 = AbstractC19590xm.A04(A04, "key_recently_uploaded_media", "");
        this.A5s = AbstractC19590xm.A06(A04, "hidden_word_upsell_nux_v2", false);
        this.A6s = AbstractC19590xm.A06(A04, "reachability_settings_upsell_nux", false);
        this.A8Q = AbstractC19590xm.A06(A04, "verified_rs_upsell_nux", false);
        this.A6J = AbstractC19590xm.A06(A04, "limited_interactions_should_show_nux", true);
        this.A53 = AbstractC19590xm.A06(A04, "has_seen_spend_x_get_y_coupon_received_on_ads_manager", false);
        this.A51 = AbstractC19590xm.A06(A04, "has_seen_sifu_header_tooltip", false);
        this.A6K = AbstractC19590xm.A06(A04, "direct_linked_page_ig_dm_access", false);
        this.A86 = AbstractC19590xm.A03(A04, "sticker_id_added_via_feed_megaphone", null);
        this.A1c = AbstractC19590xm.A06(A04, "music_changes_nux_has_acknowledged", false);
        this.A7M = AbstractC19590xm.A06(A04, "clips_remix_photos_nux_viewed", false);
        this.A7L = AbstractC19590xm.A06(A04, "clips_remix_feed_video_nux_viewed", false);
        this.A7e = AbstractC19590xm.A06(A04, "clips_separate_sequence_nux_viewed", false);
        this.A7W = AbstractC19590xm.A06(A04, "clips_new_remix_introduction_nux", false);
        this.A7K = AbstractC19590xm.A06(A04, "clips_draft_uninstall_nux", false);
        this.A7J = AbstractC19590xm.A06(A04, "clips_draft_backup_nux", false);
        this.A7T = AbstractC19590xm.A06(A04, "clips_feed_remix_photos_nux", false);
        this.A7d = AbstractC19590xm.A06(A04, "self_crop_photo_nux", false);
        this.A7X = AbstractC19590xm.A06(A04, "pin_to_grid_nux", false);
        this.A7c = AbstractC19590xm.A06(A04, "repost_sheet_title_nux", false);
        this.A7O = AbstractC19590xm.A06(A04, "clips_visual_reply_anyone_notice_tooltip_viewed", false);
        this.A7R = AbstractC19590xm.A06(A04, "comment_share_commenter_notice_tooltip_viewed", false);
        this.A7Q = AbstractC19590xm.A06(A04, "comment_reshare_tooltip_viewed", false);
        this.A7S = AbstractC19590xm.A06(A04, "comment_share_screenshot_dialog_viewed", false);
        this.A7U = AbstractC19590xm.A06(A04, "feed_visual_reply_anyone_notice_tooltip_viewed", false);
        this.A7N = AbstractC19590xm.A06(A04, "clips_visual_reply_anyone_dialog_nux_viewed", false);
        this.A7P = AbstractC19590xm.A06(A04, "clips_visual_reply_feed_anyone_dialog_nux_viewed", false);
        this.A0i = AbstractC19590xm.A06(A04, "clips_visual_reply_creation_tried", false);
        this.A7V = AbstractC19590xm.A06(A04, "live_to_clip_dialog_nux_viewed", false);
        this.A52 = AbstractC19590xm.A06(A04, "smb_support_button_tooltip_for_lead_gen", false);
        this.A3m = AbstractC19590xm.A06(A04, "lead_gen_multi_submit_nux_tooltip", false);
        this.A3C = AbstractC19590xm.A06(A04, "edit_profile_button_for_lead_gen", false);
        this.A3A = AbstractC19590xm.A06(A04, "edit_profile_button_for_expiring_discount", false);
        this.A28 = AbstractC19590xm.A06(A04, "action_buttons_for_lead_gen", false);
        this.A2S = AbstractC19590xm.A06(A04, "business_tool_impression_nux", false);
        this.A1k = AbstractC19590xm.A06(A04, "has_created_first_business_order", false);
        this.A4Q = AbstractC19590xm.A06(A04, "has_seen_order_details_nux", false);
        this.A6E = AbstractC19590xm.A03(A04, "last_seen_self_standalone_fundraiser_snack_bar", null);
        this.A3B = AbstractC19590xm.A06(A04, "edit_profile_button_for_featured_accounts", false);
        this.A1E = AbstractC19590xm.A03(A04, "feed_recs_selected_tab_group_id", null);
        this.A5z = AbstractC19590xm.A03(A04, "interop_interstitial_texts", null);
        this.A61 = AbstractC19590xm.A06(A04, "is_camera_tool_menu_right_side", false);
        this.A5q = AbstractC19590xm.A06(A04, "has_user_dismissed_first_interop_send_nux", false);
        this.A8Z = AbstractC19590xm.A03(A04, "xac_auto_upgrade_interstitial_texts", null);
        this.A5y = AbstractC19590xm.A03(A04, "interop_reachability_setting_PENDING", null);
        this.A6k = AbstractC19590xm.A03(A04, "prefetch_data", null);
        this.A5Q = AbstractC19590xm.A06(A04, "has_seen_upcoming_event_creation_dialog", false);
        this.A4g = AbstractC19590xm.A06(A04, "PREFERENCE_HAS_SEEN_QUICK_REACTION_SKINTONE_NUX", false);
        this.A6m = AbstractC19590xm.A03(A04, "PREFERENCE_QR_SKINTONE_NUX_ELIGIBLE_EMOJI_STRING", null);
        this.A1U = AbstractC19590xm.A04(A04, "fx_account_center_info", "");
        this.A1W = AbstractC19590xm.A04(A04, "fx_linkage_cache_switcher", "");
        this.A1V = AbstractC19590xm.A06(A04, "fxim_should_show_xposting_feed_is_upsell", false);
        this.A7u = AbstractC19590xm.A06(A04, "preference_interactivity_upsell_asset_button_nux", false);
        this.A6B = AbstractC19590xm.A03(A04, "last_recipient_picker_session_id", null);
        this.A5C = AbstractC19590xm.A06(A04, "story_drafts_has_seen_expiration_nux", false);
        this.A2p = AbstractC19590xm.A06(A04, "clips_nux_text_to_speech_tooltip", false);
        this.A4m = AbstractC19590xm.A06(A04, "clips_nux_resize_postcapture", false);
        this.A39 = AbstractC19590xm.A06(A04, "drafts_filter_tooltip", false);
        this.A3S = AbstractC19590xm.A06(A04, "gallery_draft_cell_tooltip", false);
        this.A3T = AbstractC19590xm.A06(A04, "gallery_template_cell_tooltip", false);
        this.A5J = AbstractC19590xm.A06(A04, "clips_nux_switch_to_reels_tooltip", false);
        this.A4U = AbstractC19590xm.A06(A04, "has_seen_permanent_media_edit_tooltip", false);
        this.A2k = AbstractC19590xm.A06(A04, "clips_question_answer_sticker_post_capture_dialog_nux", false);
        this.A2l = AbstractC19590xm.A06(A04, "clips_question_answer_sticker_post_capture_tooltip", false);
        this.A3K = AbstractC19590xm.A06(A04, "feed_post_new_post_capture_nux", false);
        this.A2e = AbstractC19590xm.A06(A04, "clips_cutout_anything_sticker_post_capture_dialog_nux", false);
        this.A57 = AbstractC19590xm.A06(A04, "stories_cutout_anything_sticker_post_capture_dialog_nux", false);
        this.A2x = AbstractC19590xm.A06(A04, "cutout_anything_first_sticker_created_dialog_nux", false);
        this.A30 = AbstractC19590xm.A06(A04, "cutout_anything_sticker_tray_tooltip", false);
        this.A2y = AbstractC19590xm.A06(A04, "cutout_anything_postcap_intro_nux_tooltip_clips", false);
        this.A2z = AbstractC19590xm.A06(A04, "cutout_anything_postcap_intro_nux_tooltip_stories", false);
        this.A32 = AbstractC19590xm.A06(A04, "cutout_anything_merchandising_consumption_first_time_exposure_nux", false);
        this.A31 = AbstractC19590xm.A06(A04, "cutout_anything_sticker_video_trim_audio_tooltip", false);
        this.A5S = AbstractC19590xm.A06(A04, "mixed_aspect_ratios_updated_crop_toggle", false);
        this.A4o = AbstractC19590xm.A06(A04, "reuse_controls_existing_user_intro_nux", false);
        this.A4p = AbstractC19590xm.A06(A04, "reuse_controls_new_user_first_post_nux", false);
        this.A4q = AbstractC19590xm.A06(A04, "reuse_controls_new_user_first_reel_nux", false);
        this.A0Y = AbstractC19590xm.A01(A04, "CLIPS_COVER_PHOTO_TEXT_ADDING_NUX_TOOLTIP_SEEN_COUNT", 0);
        this.A0Z = AbstractC19590xm.A04(A04, "CLIPS_COVER_PHOTO_TEXT_ADDING_NUX_TOOLTIP_PREVIOUS_SESSION_ID", "");
        this.A0z = AbstractC19590xm.A06(A04, "direct_message_notification_status", false);
        this.A10 = AbstractC19590xm.A06(A04, "direct_message_request_notification_mute_status", false);
        this.A3o = AbstractC19590xm.A06(A04, "HAS_SEEN_LONG_REELS_DIALOG_NUX", false);
        this.A4V = AbstractC19590xm.A06(A04, "HAS_SEEN_PHOTOMASH_DIALOG_NUX", false);
        this.A6V = AbstractC19590xm.A02(A04, "MEDIA_METADATA_CLEANUP_TIMESTAMP_MS", 0L, false);
        this.A2X = AbstractC19590xm.A06(A04, "has_seen_carousel_max_size_increase_nux", false);
        this.A66 = AbstractC19590xm.A06(A04, "is_gallery_suggestions_enabled", false);
        this.A5D = AbstractC19590xm.A06(A04, "has_seen_story_glasses_bottom_sheet", false);
        this.A22 = AbstractC19590xm.A06(A04, "has_heard_story_glasses_preview_nux", false);
        this.A6a = AbstractC19590xm.A04(A04, "mwa_last_synced_app_version", "");
        this.A89 = AbstractC19590xm.A04(A04, "sup_last_synced_firmware_version", "");
        this.A5u = AbstractC19590xm.A04(A04, "ig_last_synced_app_version", "");
        this.A8B = AbstractC19590xm.A04(A04, "sup_toolkit_last_synced_device_image_asset", "");
        this.A8C = AbstractC19590xm.A04(A04, "sup_toolkit_last_synced_device_model_name", "");
        this.A8A = AbstractC19590xm.A04(A04, "sup_toolkit_last_synced_device_firmware", "");
        this.A6G = AbstractC19590xm.A06(A04, "limited_interactions_enabled", false);
        this.A6I = AbstractC19590xm.A06(A04, "limited_interactions_non_followers_enabled", false);
        this.A6H = AbstractC19590xm.A06(A04, "limited_interactions_new_followers_enabled", false);
        this.A0E = AbstractC19590xm.A06(A04, "auto_created_reels_from_camera_roll_notification_sent", false);
        this.A79 = AbstractC19590xm.A03(A04, "reel_last_modified_draft", null);
        this.A36 = AbstractC19590xm.A06(A04, "has_seen_direct_vm_24hr_self_replay_nux_dialog", false);
        this.A8M = AbstractC19590xm.A06(A04, "user_consent_query_loaded", false);
        this.A8K = AbstractC19590xm.A06(A04, "user_consent_query_consented", false);
        this.A8N = AbstractC19590xm.A06(A04, "user_consent_query_settings_required", false);
        this.A8L = AbstractC19590xm.A06(A04, "user_consent_query_first_party_tracking", false);
        this.A5W = AbstractC19590xm.A06(A04, "has_seen_visual_search_camera_tooltip_on_shop_tab", false);
        this.A5V = AbstractC19590xm.A06(A04, "has_seen_visual_search_camera_nux_dialog", false);
        this.A8J = AbstractC19590xm.A03(A04, "unliked_your_activity_upsells_timestamps_sec", null);
        this.A8I = AbstractC19590xm.A03(A04, "unliked_your_activity_upsells_unlike_data", null);
        this.A0q = AbstractC19590xm.A03(A04, "bulk_delete_your_activity_upsells_deleted_post_timestamps", null);
        this.A0p = AbstractC19590xm.A03(A04, "bulk_delete_your_activity_upsells_deleted_clip_timestamps", null);
        this.A64 = AbstractC19590xm.A06(A04, "custom_launcher_sync_interval", false);
        this.A0H = AbstractC19590xm.A06(A04, "basic_ads_opt_in_status", false);
        this.A0I = AbstractC19590xm.A03(A04, "basic_ads_tier", EnumC23041Aj.BASIC_ADS_TIER_NONE.toString());
        this.A06 = AbstractC19590xm.A03(A04, "afs_enablement_status", null);
        this.A0o = AbstractC19590xm.A03(A04, "connection_service_user_phone_account_id", null);
        this.A3w = AbstractC19590xm.A06(A04, "has_seen_manage_your_draft_tooltip", false);
        this.A1e = AbstractC19590xm.A06(A04, "has_clips_together_audio_video_dialog_been_seen", false);
        this.A29 = AbstractC19590xm.A06(A04, "has_seen_postcapture_add_clip_nux", false);
        this.A5k = AbstractC19590xm.A06(A04, "has_tapped_on_external_sharing_overflow_user_education", false);
        this.A3G = AbstractC19590xm.A06(A04, "has_seen_external_sharing_overflow_user_education", false);
        this.A3E = AbstractC19590xm.A06(A04, "has_seen_external_sharing_app_tray_nux", false);
        this.A3F = AbstractC19590xm.A06(A04, "has_seen_external_sharing_education_nux", false);
        this.A19 = AbstractC19590xm.A01(A04, "external_sharing_education_nux_impression_count", 0);
        this.A1A = AbstractC19590xm.A03(A04, "external_sharing_universe_name", null);
        this.A27 = AbstractC19590xm.A06(A04, "has_seen_acr_camera_roll_access_consent_nux", false);
        this.A1d = AbstractC19590xm.A06(A04, "has_allowed_acr_camera_roll_access", false);
        this.A2W = AbstractC19590xm.A06(A04, "has_seen_acr_camera_roll_access_confirm_nux", false);
        this.A2o = AbstractC19590xm.A06(A04, "has_seen_clips_reuse_text_dialog", false);
        this.A6C = AbstractC19590xm.A03(A04, "last_seen_clips_suggested_audio_pill_track_id", null);
        this.A6F = AbstractC19590xm.A03(A04, "last_used_camera_destination_in_plus_bar", null);
        this.A6Y = AbstractC19590xm.A03(A04, "most_used_camera_destination", null);
        this.A1a = AbstractC19590xm.A06(A04, "has_seen_suggested_replies_nux", false);
        this.A14 = AbstractC19590xm.A06(A04, "eligible_for_suggested_replies_inbox_tooltip", false);
        this.A6d = AbstractC19590xm.A02(A04, "num_times_seen_suggested_replies_nux", 0L, false);
        this.A02 = new ConcurrentHashMap();
        this.A5w = AbstractC19590xm.A06(A04, "injected_post_to_feed", false);
        this.A1Y = AbstractC19590xm.A06(A04, "discoverable_chat_create_flow_nux", false);
        this.A2Y = AbstractC19590xm.A06(A04, "channel_creator_nux_variant", false);
        this.A38 = AbstractC19590xm.A06(A04, "discoverable_chat_joinflow_nux", false);
        this.A3W = AbstractC19590xm.A06(A04, "group_profile_channel_create_flow_nux", false);
        this.A3X = AbstractC19590xm.A06(A04, "group_profile_channel_join_flow_nux", false);
        this.A1Z = AbstractC19590xm.A06(A04, "join_chat_sticker_has_accepted_high_risk_nux", false);
        this.A4C = AbstractC19590xm.A06(A04, "direct_notes_creation_nux", false);
        this.A3U = AbstractC19590xm.A06(A04, "group_mention_entry_nux", false);
        this.A3V = AbstractC19590xm.A06(A04, "group_mention_participation_nux", false);
        this.A4E = AbstractC19590xm.A06(A04, "direct_notes_reply_nux", false);
        this.A4D = AbstractC19590xm.A06(A04, "note_replies_has_seen_avatar_sticker_tab", false);
        this.A6D = AbstractC19590xm.A04(A04, "note_replies_last_seen_sticker_tab", "");
        this.A2T = AbstractC19590xm.A06(A04, "direct_cf_hub_music_notes_disclaimer", false);
        this.A2j = AbstractC19590xm.A06(A04, "has_seen_clips_played_by_consumption_snackbar", false);
        this.A2L = AbstractC19590xm.A06(A04, "has_seen_audio_top_bar_educational_nux", false);
        this.A7z = AbstractC19590xm.A06(A04, "show_direct_unsend_message_educational_dialog", false);
        this.A7Y = AbstractC19590xm.A06(A04, "seen_post_add_organic_cta_tooltip_nux", false);
        this.A7Z = AbstractC19590xm.A06(A04, "seen_post_reel_add_organic_cta_tooltip_nux", false);
        this.A7b = AbstractC19590xm.A06(A04, "seen_reel_add_organic_cta_tooltip_nux", false);
        this.A7a = AbstractC19590xm.A06(A04, "seen_post_sell_product_row_tooltip_nux", false);
        this.A7h = AbstractC19590xm.A06(A04, "sell_product_row_tapped", false);
        this.A7A = AbstractC19590xm.A06(A04, "reel_sell_product_row_tapped", false);
        this.A7g = AbstractC19590xm.A03(A04, "selected_currency", null);
        this.A5K = AbstractC19590xm.A06(A04, "has_seen_tas_education_screen_nux", false);
        this.A2I = AbstractC19590xm.A06(A04, "has_seen_alt_text_nux", false);
        this.A5L = AbstractC19590xm.A06(A04, "has_seen_tas_tooltip_nux", false);
        this.A4R = AbstractC19590xm.A06(A04, "has_seen_organic_iab_message_ext_tooltip", false);
        this.A55 = AbstractC19590xm.A06(A04, "has_seen_stacked_timeline_preview_fling_education", false);
        this.A54 = AbstractC19590xm.A06(A04, "has_seen_stacked_timeline_multiple_audio_track_add_audio", false);
        this.A3x = AbstractC19590xm.A06(A04, "has_seen_meme_background_selected_cutout_sticker_duration_tooltip", false);
        this.A56 = AbstractC19590xm.A06(A04, "has_seen_stacks_to_reels_tooltip", false);
        this.A2s = AbstractC19590xm.A06(A04, "has_seen_collaborative_albums_tooltip", false);
        this.A2r = AbstractC19590xm.A06(A04, "has_seen_collaborative_albums_creation_nux", false);
        this.A2t = AbstractC19590xm.A06(A04, "has_seen_collaborative_albums_recipient_nux", false);
        this.A2d = AbstractC19590xm.A06(A04, "has_seen_clips_collaborator_preloaded_nux", false);
        this.A2g = AbstractC19590xm.A06(A04, "has_seen_clips_invite_collaborator_preloaded_nux", false);
        this.A2h = AbstractC19590xm.A06(A04, "has_seen_clips_invite_first_few_collaborator_preloaded_nux", false);
        this.A68 = AbstractC19590xm.A06(A04, "is_mention_reshare_fullscreen", false);
        this.A7v = AbstractC19590xm.A06(A04, "should_show_mention_reshare_tooltip", true);
        this.A07 = AbstractC19590xm.A01(A04, "ai_themes_new_badge_in_thread_details_impression_count", 0);
        this.A08 = AbstractC19590xm.A06(A04, "ai_themes_was_opened", false);
        this.A5O = AbstractC19590xm.A06(A04, "has_seen_trend_report_banner", false);
        this.A2J = AbstractC19590xm.A06(A04, "has_seen_artist_pinning_nux", false);
        this.A3e = AbstractC19590xm.A06(A04, "seen_hw_secure_consent_nux", false);
        this.A3c = AbstractC19590xm.A06(A04, "seen_hw_custom_list_secure_consent_nux", false);
        this.A3d = AbstractC19590xm.A06(A04, "seen_hw_custom_word_list_secure_consent_nux", false);
        this.A5r = AbstractC19590xm.A04(A04, "hw_custom_word_list_server_optimistic_value", "");
        this.A3b = AbstractC19590xm.A06(A04, "seen_hw_consent_save_action_warning_nux", false);
        this.A4K = AbstractC19590xm.A06(A04, "seen_odn_secure_consent_nux", false);
        this.A5n = AbstractC19590xm.A06(A04, "recon_destination_has_tapped_profile_menu_option", false);
        this.A4k = AbstractC19590xm.A06(A04, "recon_destination_nux", false);
        this.A4n = AbstractC19590xm.A06(A04, "has_seen_reusable_text_tooltip", false);
        this.A2q = AbstractC19590xm.A06(A04, "has_seen_clips_viewer_sequential_remix_tooltip", false);
        this.A4w = AbstractC19590xm.A06(A04, "has_seen_self_reel_insights_nux", false);
        this.A5R = AbstractC19590xm.A06(A04, "has_seen_upcoming_event_on_profile_tooltip", false);
        this.A1v = AbstractC19590xm.A06(A04, "has_dismissed_moderator_role_nux", false);
        this.A17 = AbstractC19590xm.A03(A04, "event_recent_emoji_list", null);
        this.A5m = AbstractC19590xm.A06(A04, "has_tapped_quiet_posting_creation_menu_option", false);
        this.A5i = AbstractC19590xm.A06(A04, "has_tapped_music_highlight_creation_menu_option", false);
        this.A5b = AbstractC19590xm.A06(A04, "has_tapped_ai_agent_creation_menu_option", false);
        this.A1p = AbstractC19590xm.A06(A04, "has_dismissed_creation_menu_badge_for_ai_agent_option", false);
        this.A2R = AbstractC19590xm.A06(A04, "broadcast_channel_question_prompt_tooltip", false);
        this.A4v = AbstractC19590xm.A06(A04, "opal_self_nux_bottomsheet", false);
        this.A5T = AbstractC19590xm.A06(A04, "opal_user_badge_intro", false);
        this.A4L = AbstractC19590xm.A06(A04, "opal_audience_tooltip", false);
        this.A5U = AbstractC19590xm.A06(A04, "opal_user_nux_bottomsheet", false);
        this.A5j = AbstractC19590xm.A06(A04, "has_tapped_on_clips_channel_sticker", false);
        this.A20 = AbstractC19590xm.A06(A04, "layering_tool_has_entered_layering_tool", false);
        this.A23 = AbstractC19590xm.A06(A04, "has_onboarded_into_memu", false);
        this.A3t = AbstractC19590xm.A06(A04, "has_seen_magic_mod_disclosure_nux", false);
        this.A3u = AbstractC19590xm.A06(A04, "has_seen_magic_mod_disclosure_nux_v2", false);
        this.A1g = AbstractC19590xm.A06(A04, "has_consented_magic_mod_tool_backdrop", false);
        this.A1h = AbstractC19590xm.A06(A04, "has_consented_magic_mod_tool_expander", false);
        this.A1i = AbstractC19590xm.A06(A04, "has_consented_magic_mod_tool_restyle", false);
        this.A1j = AbstractC19590xm.A06(A04, "has_consented_memu_creator_templates", false);
        this.A6T = AbstractC19590xm.A02(A04, "magic_mod_consent_last_updated_in_ms", -1L, false);
        this.A3r = AbstractC19590xm.A06(A04, "has_seen_magic_mod_backdrop_tooltip", false);
        this.A3s = AbstractC19590xm.A06(A04, "has_seen_magic_mod_bundle_tooltip", false);
        this.A3v = AbstractC19590xm.A06(A04, "has_seen_magic_mod_restyle_tooltip", false);
        this.A2D = AbstractC19590xm.A06(A04, "has_seen_ai_contextual_background_tooltip", false);
        this.A2C = AbstractC19590xm.A06(A04, "has_seen_ai_contextual_background_nux", false);
        this.A5a = AbstractC19590xm.A06(A04, "has_signed_up_for_magic_mod_tool_notification", false);
        this.A5o = AbstractC19590xm.A06(A04, "has_triggered_magic_mod_backdrop_notification", false);
        this.A5p = AbstractC19590xm.A06(A04, "has_triggered_magic_mod_restyle_notification", false);
        this.A6X = AbstractC19590xm.A03(A04, "meta_gallery_recents_cache", null);
        this.A15 = AbstractC19590xm.A06(A04, "preference_open_link_in_external_browser", false);
        this.A6l = AbstractC19590xm.A01(A04, "business_inbox_customer_details_tos_accepted", 0);
        this.A48 = AbstractC19590xm.A06(A04, "has_seen_new_feed_filters_nux", false);
        this.A3N = AbstractC19590xm.A06(A04, "has_seen_feed_reorder_nux", false);
        this.A3O = AbstractC19590xm.A06(A04, "has_seen_feed_video_zoom_nux", false);
        this.A47 = AbstractC19590xm.A06(A04, "has_seen_new_feed_audio_filters_nux", false);
        this.A3i = AbstractC19590xm.A06(A04, "has_seen_immersive_reel_reshare_full_screen_nux_v3", false);
        this.A3j = AbstractC19590xm.A06(A04, "has_seen_immersive_reel_reshare_shrink_nux_v3", false);
        this.A58 = AbstractC19590xm.A06(A04, "has_seen_stories_soft_tagging_nux", false);
        this.A6A = AbstractC19590xm.A06(A04, "is_reel_reshare_full_screen_v3", C18U.A06(C06090Tz.A06, userSession, 36323161193065520L));
        this.A62 = AbstractC19590xm.A06(A04, "is_content_scheduling_in_share_sheet_enabled", false);
        this.A1u = AbstractC19590xm.A06(A04, "has_dismissed_invites_search_row_typeahead", false);
        this.A1t = AbstractC19590xm.A06(A04, "has_dismissed_invites_search_row_serp", false);
        this.A8U = AbstractC19590xm.A02(A04, "wall_badge_last_fetch_ts", 0L, false);
        this.A8T = AbstractC19590xm.A01(A04, "wall_badge_count", 0);
        this.A8Y = AbstractC19590xm.A02(A04, "wall_self_profile_tooltip_last_shown_ts", 0L, false);
        this.A8W = AbstractC19590xm.A02(A04, "wall_other_profile_tooltip_last_shown_ts", 0L, false);
        this.A8X = AbstractC19590xm.A01(A04, "wall_self_profile_header_tooltip_count", 0);
        this.A8V = AbstractC19590xm.A01(A04, "wall_other_profile_header_tooltip_count", 0);
        this.A4y = AbstractC19590xm.A06(A04, "self_wall_nux_seen", false);
        this.A4S = AbstractC19590xm.A06(A04, "other_wall_nux_seen", false);
        this.A1M = AbstractC19590xm.A06(A04, "friend_map_location_consent_granted", false);
        this.A1P = AbstractC19590xm.A01(A04, "friend_map_notes_nux_shown_times", 0);
        this.A1N = AbstractC19590xm.A01(A04, "friend_map_location_nux_shown_times", 0);
        this.A1O = AbstractC19590xm.A01(A04, "friend_map_location_trust_dialog_shown_times", 0);
        this.A1K = AbstractC19590xm.A01(A04, "friend_map_create_note_tooltip_shown_times", 0);
        this.A1J = AbstractC19590xm.A02(A04, "friend_map_create_note_tooltip_shown_timestamp", 0L, false);
        this.A1S = AbstractC19590xm.A01(A04, "friend_map_settings_tooltip_shown_times", 0);
        this.A1T = AbstractC19590xm.A02(A04, "friend_map_settings_tooltip_shown_timestamp", 0L, false);
        this.A1Q = AbstractC19590xm.A06(A04, "friend_map_notes_tray_badge_shown", false);
        this.A1R = AbstractC19590xm.A02(A04, "friend_map_notes_tray_badge_shown_timestamp", 0L, false);
        this.A1L = AbstractC19590xm.A01(A04, "friend_map_hidden_places_tooltip_shown_times", 0);
        this.A0J = AbstractC19590xm.A02(A04, "black_hole_url_last_sync_date_key", 0L, false);
        this.A7w = AbstractC19590xm.A06(A04, "odnc_show_teens_user_notice", false);
        this.A7t = AbstractC19590xm.A06(A04, "preferences_show_e2ee_preview", true);
        this.A0u = AbstractC19590xm.A01(A04, "destination_toolbar_animation_nux_seen_count", 0);
        this.A0r = AbstractC19590xm.A01(A04, "destination_toolbar_music_animation_nux_seen_count", 0);
        this.A0t = AbstractC19590xm.A01(A04, "destination_toolbar_music_vinyl_nux_seen_count", 0);
        this.A1q = AbstractC19590xm.A06(A04, "story_has_dismissed_destination_toolbar_music_first_new_badge", false);
        this.A0s = AbstractC19590xm.A01(A04, "destination_toolbar_music_first_new_badge_impression_count", 0);
        this.A0b = AbstractC19590xm.A01(A04, "clips_schedule_new_badge_impression_count", 0);
        this.A6p = AbstractC19590xm.A06(A04, "quick_snap_creation_onboarding_completed", false);
        this.A6q = AbstractC19590xm.A06(A04, "quick_snap_practice_onboarding_completed", false);
        this.A6n = AbstractC19590xm.A01(A04, "quick_snap_archive_tooltip_shown_count", 0);
        this.A6o = AbstractC19590xm.A02(A04, "quick_snap_archive_tooltip_last_shown_ts", 0L, false);
        this.A4h = AbstractC19590xm.A06(A04, "has_seen_quick_snap_consumption_nux", false);
        this.A6r = AbstractC19590xm.A01(A04, "quick_snap_tab_icon_upsell_shown_count", 0);
        this.A4i = AbstractC19590xm.A06(A04, "has_seen_quick_snap_new_badge_upsell", false);
        this.A4x = AbstractC19590xm.A06(A04, "has_seen_self_trial_reel_insight_entry_point_tooltip", false);
        this.A3g = AbstractC19590xm.A06(A04, "has_seen_igd_filter_flag_redesign_banner", false);
        this.A35 = AbstractC19590xm.A06(A04, "has_seen_detected_outcomes_nux", false);
        this.A5e = AbstractC19590xm.A06(A04, "has_tapped_creator_viewer_insight_line_nux", false);
        this.A0v = AbstractC19590xm.A02(A04, "detected_outcomes_nux_last_check_timestamp_ms", 0L, false);
        this.A6W = AbstractC19590xm.A02(A04, "media_reminder_in_feed_last_seen_timestamp_ms", 0L, false);
        this.A1r = AbstractC19590xm.A06(A04, "clips_has_dismissed_destination_toolbar_saved_audio_gallery_new_badge", false);
    }

    public static final String A00(EnumC193878i8 enumC193878i8) {
        int ordinal = enumC193878i8.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal == 2) {
                    return "magic_mod_expander_tool_nux_seen_count";
                }
                throw new RuntimeException();
            }
            return "magic_mod_backdrop_tool_nux_seen_count";
        }
        return "magic_mod_restyle_tool_nux_seen_count";
    }

    public static final boolean A07(C23031Ai c23031Ai, String str, long j) {
        if (System.currentTimeMillis() - c23031Ai.A01.getLong(str, 0L) <= TimeUnit.DAYS.toMillis(j)) {
            return false;
        }
        return true;
    }

    public static final boolean A08(C23031Ai c23031Ai, String str, long j) {
        if (System.currentTimeMillis() - c23031Ai.A01.getLong(str, 0L) <= TimeUnit.HOURS.toMillis(j)) {
            return false;
        }
        return true;
    }

    public final List A0G() {
        List A04 = A04(this, "parenting_accounts_visited");
        if (A04.isEmpty()) {
            return new ArrayList();
        }
        return A04;
    }

    public final void A0d(long j) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7G("content_notes_like_nudge_session_count", j);
        ARD.apply();
    }

    public final void A0o(LruCache lruCache) {
        String A0B = new Gson().A0B(lruCache.snapshot());
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7K("auto_created_clips_source_medium_cache", A0B);
        ARD.apply();
    }
}
