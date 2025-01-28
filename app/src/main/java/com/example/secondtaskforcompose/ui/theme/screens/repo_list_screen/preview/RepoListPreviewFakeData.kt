package com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.preview

import com.example.secondtaskforcompose.R
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.model.RepoDetails
import com.example.secondtaskforcompose.ui.theme.screens.repo_list_screen.model.RepoItemUiModel

val FakeGithubRepoUiModels = RepoItemUiModel(
    id=1,
    name="Kotlin",
    ownerName="Google",
    description="this repo is for Kotlin Programming Language and it`s the main language for Google",
    stars=1000,
    avatarUrl=""
)
val FakeGithubRepoUiModels1 = RepoItemUiModel(
    id=2,
    name="Java",
    ownerName="Google",
    description="this repo is for Kotlin Programming Language and it`s the main language for Google",
    stars=2000,
    avatarUrl=""
)
val FakeGithubRepoUiModels2 = RepoItemUiModel(
    id=3,
    name="XML",
    ownerName="Google",
    description="this repo is for Kotlin Programming Language and it`s the main language for Google",
    stars=100,
    avatarUrl=""
)
val FakeGithubRepoUiModels3 = RepoItemUiModel(
    id=4,
    name="Mobile",
    ownerName="Google",
    description="this repo is for Kotlin Programming Language and it`s the main language for Google",
    stars=4000,
    avatarUrl=""
)
val FakeGithubRepoListUiModel= listOf(
    FakeGithubRepoUiModels,
    FakeGithubRepoUiModels1,
    FakeGithubRepoUiModels2,
    FakeGithubRepoUiModels3
)
val fakeRepoList = listOf(
    RepoDetails(
        id = 1,
        title = "Kotlin",
        description = "A modern programming language for Android development.",
        imageRes = R.drawable.kotlin_logo,
        stars = 1000,
        ownerName = "Google"
    ),
    RepoDetails(
        id = 2,
        title = "Python",
        description = "Python is a versatile, high-level programming language known for its readability and simplicity. Created by Guido van Rossum in 1991, Python supports multiple programming paradigms, including procedural, object-oriented, and functional programming. It is widely used for web development, data science, machine learning, automation, and scientific computing due to its extensive libraries and frameworks.",
        imageRes = R.drawable.python_logo,
        stars = 6000,
        ownerName = "PSF"
    ),
    RepoDetails(
        id = 3,
        title = "C++",
        description = "C++ is a high-performance, general-purpose programming language designed by Bjarne Stroustrup in 1983. It extends the capabilities of the C language by incorporating object-oriented programming features such as classes, inheritance, and polymorphism. Known for its speed and control over system resources, C++ is widely used in areas like system software, game development, embedded systems, and high-performance applications.",
        imageRes = R.drawable.c_logo,
        stars = 5000,
        ownerName = "Google"
    ),
    RepoDetails(
        id = 4,
        title = "C#",
        description = "C# (pronounced \"C-Sharp\") is a modern, object-oriented programming language developed by Microsoft in 2000 as part of the .NET framework. It is designed for building Windows applications, web services, and enterprise-level software. C# offers strong type checking, garbage collection, and advanced features like LINQ, async programming, and support for cross-platform development through .NET Core.",
        imageRes = R.drawable.c2_logo,
        stars = 4000,
        ownerName = "Microsoft"
    ),
    RepoDetails(
        id = 5,
        title = "Jollibee Foods Corporation",
        description = "Compose is a declarative UI toolkit designed for building modern, responsive user interfaces for Android applications. Jetpack Compose, developed by Google, simplifies UI development by allowing developers to build layouts with less code using a Kotlin-based syntax. Its reactive programming model enables efficient updates to the UI when state changes.",
        imageRes = R.drawable.compose_logo,
        stars = 4000,
        ownerName = "Google"
    ),
    RepoDetails(
        id = 6,
        title = "Java",
        description = "Java is a versatile, platform-independent programming language designed by Sun Microsystems (now owned by Oracle) in 1995. It follows the \"write once, run anywhere\" (WORA) philosophy, allowing applications to run on any system with a Java Virtual Machine (JVM). Java is commonly used for building enterprise-level applications, Android apps, and server-side systems.",
        imageRes = R.drawable.java_logo,
        stars = 6000,
        ownerName = "Oracle"
    ),
    RepoDetails(
        id = 7,
        title = "julia",
        description = "Julia is a high-performance programming language designed for numerical computing, data analysis, and scientific computing. Released in 2012, Julia offers the speed of low-level languages like C with the ease of use of high-level languages like Python. It excels in tasks requiring intensive mathematical computation and supports parallelism and distributed computing.",
        imageRes = R.drawable.julia_logo,
        stars = 800,
        ownerName = "PSF"
    ),
    RepoDetails(
        id = 8,
        title = "Language",
        description = "A language is a structured system of communication used by humans to express thoughts, convey information, and share emotions. It can take various forms, including spoken words, written text, or symbolic systems like sign language. Languages are composed of rules (grammar), sounds or symbols (phonology or characters), and meanings (semantics).",
        imageRes = R.drawable.language_logo,
        stars = 1000,
        ownerName = "AUC"
    ),
    RepoDetails(
        id = 9,
        title = "less",
        description = "LESS (Leaner Style Sheets) is a dynamic preprocessor language for CSS. It extends CSS by introducing variables, nested rules, mixins, and functions, making stylesheets more manageable and reusable. LESS compiles into standard CSS, enabling compatibility with web browsers while enhancing productivity for developers.",
        imageRes = R.drawable.less_logo,
        stars = 2000,
        ownerName = "PSF"
    ),
    RepoDetails(
        id = 10,
        title = "ML",
        description = "Machine Learning (ML) is a subset of artificial intelligence (AI) that enables systems to learn and improve from experience without being explicitly programmed. ML algorithms analyze data, identify patterns, and make predictions or decisions. Applications of ML include image recognition, natural language processing, recommendation systems, and predictive analytics.",
        imageRes = R.drawable.ml_logo,
        stars = 5000,
        ownerName = "PSF"
    ),
    RepoDetails(
        id = 11,
        title = "Mobile application",
        description = "A mobile application, or app, is software specifically designed to run on mobile devices like smartphones and tablets. Mobile apps can be native (built for a specific platform like Android or iOS), web-based, or cross-platform using frameworks like Flutter or React Native. They are used for various purposes, including communication, entertainment, productivity, and e-commerce.",
        imageRes = R.drawable.mobile_app_logo,
        stars = 10000,
        ownerName = "PSF"
    ),
    RepoDetails(
        id = 12,
        title = "XML",
        description = "XML is a flexible markup language used to store, transport, and structure data in a human-readable and machine-readable format. Designed by the World Wide Web Consortium (W3C), XML is widely used for data exchange in web applications, configuration files, and document storage. It provides a hierarchical structure with customizable tags, making it suitable for diverse use cases.\n",
        imageRes = R.drawable.xml_logo,
        stars = 800,
        ownerName = "PSF"
    ),
    RepoDetails(
        id = 13,
        title = "rust",
        description = "Rust is a systems programming language focused on safety, performance, and concurrency. Developed by Mozilla and first released in 2010, Rust aims to provide memory safety without a garbage collector by using a unique ownership model. This feature helps prevent common bugs like null pointer dereferencing, buffer overflows, and data races in concurrent environments. Rust is known for its strong static typing and strict compiler checks, ensuring that developers catch errors at compile time. It is increasingly used for building high-performance applications such as web servers, operating systems, and game engines, where both safety and speed are critical. Rust is also popular for its vibrant community and ecosystem, with the language often praised for its developer experience.",
        imageRes = R.drawable.rust_logo,
        stars = 2000,
        ownerName = "PSF"
    ),
    RepoDetails(
        id = 14,
        title = "ruby",
        description = "Ruby is a dynamic, open-source programming language focused on simplicity and productivity. Designed by Yukihiro \"Matz\" Matsumoto in the mid-1990s, Ruby combines elements of other programming languages like Perl, Smalltalk, Eiffel, Ada, and Lisp, resulting in an elegant syntax that is easy to read and write.",
        imageRes = R.drawable.ruby_logo,
        stars = 4000,
        ownerName = "Google"
    ),
    RepoDetails(
        id = 15,
        title = "OS",
        description = "An Operating System (OS) is a foundational software that manages computer hardware, software resources, and provides services for application programs. It acts as an intermediary between users and the computer hardware, enabling efficient execution of tasks and a user-friendly interface for interaction.",
        imageRes = R.drawable.operating_system_logo,
        stars = 40000,
        ownerName = "Microsoft"
    )

)